package app.hl7_parser;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import app.parsing.Utils;

/**
 * Hl7Serializer
 * 
 * @author Thomas Biedermann
 */

 //TODO layer richtig erhöhen und verringern
 
public class Hl7Serializer {
    private static String[] layerSep = new String[] { "", "|", "^", "~", "\\", "&" };

    private static int layer = 0;

    public static String parse(Object o) {
        String out = "";
        out += Hl7Serializer.serialize(o);
        return out;
    }

    private static String serialize(Object object) {
        String out = "";
        Class<?> obj = object.getClass();

        if (obj.isAnnotationPresent(Hl7Serializeable.class)) {
            Field[] fs = obj.getDeclaredFields();
            // int lastIndex = Hl7Serializer.getLastFieldIndex(fs, object);
            for (int i = 0; i < fs.length; i++) {
                Field f = fs[i];
                if (f.isAnnotationPresent(Hl7Field.class)) {
                    f.setAccessible(true);

                    try {
                        out += Hl7Serializer.retriveValue(f, object, i, fs.length);
                        if (isSegment(object) && i == fs.length - 1) {
                            out += "\n";
                        }
                    } catch (IllegalArgumentException | IllegalAccessException e) {
                        e.printStackTrace();
                    }

                    f.setAccessible(false);
                }
            }
        }
        obj = null;
        return out;
    }

    private static String retriveValue(Field field, Object o0, int c, int max)
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
                        out += layerSep[layer - 1];
                    }
                } else {
                    out += o1;
                    if (!(c + 1 == max)) {
                        out += layerSep[layer - 1];
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

    private static int getLastFieldIndex(Field[] fields, Object object) {
        /**
         * ! Fuck Java hör auf die fields nach Namen zu sortieren 😠
         */

        int c = fields.length - 1;
        while (c >= 0) {
            fields[c].setAccessible(true);
            try {
                if (fields[c].get(object) == null) {
                    c--;
                } else {
                    break;
                }
            } catch (Exception e) {
            }
            fields[c].setAccessible(false);
        }
        return c;
    }
}