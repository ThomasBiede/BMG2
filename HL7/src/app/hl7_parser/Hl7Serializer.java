package app.hl7_parser;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import app.parsing.Utils;

/**
 * Hl7Serializer
 * 
 * @author Thomas Biedermann
 */

// TODO layer richtig erhöhen und verringern

public class Hl7Serializer {
    private static String[] layerSep = new String[] { "", "|", "^", "~", "\\", "&" };

    public static String parse(Object o) {
        String out = "";
        try {
            out += Hl7Serializer.serialize(o);
        } catch (IllegalArgumentException | IllegalAccessException | NullPointerException e) {
            e.printStackTrace();
        }
        return out;
    }

    private static String serialize(Object object)
            throws IllegalArgumentException, IllegalAccessException, NullPointerException {
        String out = "";
        Class<?> obj = object.getClass();

        if (obj.isAnnotationPresent(Hl7Serializeable.class)) {
            int layer = obj.getAnnotation(Hl7Serializeable.class).layer();
            Field[] fs = obj.getDeclaredFields();

            int lastIndex = Hl7Serializer.getLastFieldIndex(fs, object);
            for (int i = 0; i < lastIndex + 1; i++) {
                Field f = fs[i];
                if (f.isAnnotationPresent(Hl7Field.class)) {
                    f.setAccessible(true);
                    out += Hl7Serializer.retriveValue(f, object, i, lastIndex + 1, layer);
                    if (isSegment(object) && i == lastIndex) {
                        out += "\n";
                    }
                    f.setAccessible(false);
                }
            }
        }
        obj = null;
        return out;
    }

    private static String retriveValue(Field field, Object o0, int c, int max, int layer)
            throws IllegalArgumentException, IllegalAccessException, NullPointerException {
        String out = "";
        Type t = field.getType();
        Object o1 = field.get(o0);

        field.setAccessible(true);

        if (o1 != null) {
            if (t.equals(Set.class)) {
                Set<?> s = (Set<?>) o1;

                for (Object o2 : s) {
                    if (o2 != null) {
                        if (isSegment(o2) || isSubSegment(o2)) {
                            out += Hl7Serializer.serialize(o2);
                        } else {
                            out += o2;
                        }
                    }
                }

            } else if (!o1.getClass().getName().startsWith("java.")) {
                out += Hl7Serializer.serialize(o1);

            } else {
                String msgField = "" + o1;
                if ((msgField.equals("0") || msgField.equals("0.0"))) {
                    if (!(c + 1 == max)) {
                        out += layerSep[layer];
                    }
                } else {
                    out += o1;
                    if (!(c + 1 == max)) {
                        out += layerSep[layer];
                    }
                }
            }
        }
        return out;
    }

    private static boolean isSegment(Object o) {
        Set<String> keys = Utils.segmentIdMap.keySet();
        String className = o.getClass().getSimpleName();

        if (keys.contains(className)) {
            return true;
        }
        return false;
    }

    private static boolean isSubSegment(Object o) {
        String className = o.getClass().getSimpleName();
        ArrayList<String> subSegments = new ArrayList<String>() {
            private static final long serialVersionUID = 1L;
            {
                add("XAD");
                add("XCN");
                add("XPN");
                add("XTN");
            }
        };
        if (subSegments.contains(className)) {
            return true;
        }
        return false;
    }

    private static int getLastFieldIndex(Field[] fields, Object object) throws IllegalArgumentException, IllegalAccessException {
        int c = fields.length - 1;
        while (c >= 0) {
            fields[c].setAccessible(true);
            
            try {
                Object o = fields[c].get(object);

                if (o.getClass().equals(HashSet.class)) {
                    HashSet<?> s = (HashSet<?>) o;
                    if (s.size() == 0) {
                        c--;
                    } else {
                        break;
                    }
                } else if(o != null){
                    break;
                } 
            } catch (NullPointerException e) {
                c--;
            }

            fields[c].setAccessible(false);
        }
        return c;
    }
}