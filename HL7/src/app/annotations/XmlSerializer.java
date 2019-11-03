package app.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Set;

/**
 * XmlSerializer
 */
public class XmlSerializer {
    private static String fileOut = "<?xml version='1.0' encoding='UTF-8' standalone='yes'?>\n";

    public static String serialize(Object object) {

        Class<?> obj = object.getClass();
        String name = "";
        Object retrvObj = null;
        String outString = "";

        if (obj.isAnnotationPresent(XmlSerializeable.class)) {
            for (Field f : obj.getDeclaredFields()) {
                if (f.isAnnotationPresent(XmlField.class)) {

                    f.setAccessible(true);
                    Annotation annotationField = f.getAnnotation(XmlField.class);
                    XmlField xf = (XmlField) annotationField;

                    try {
                        outString += retriveValue(f, object);
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    // if (xf.key().equals("")) {
                    // name = f.getName();
                    // } else {
                    // name = xf.key();
                    // }

                    // try {
                    // retrvObj = f.get(object);
                    // } catch (IllegalArgumentException | IllegalAccessException e) {
                    // e.printStackTrace();
                    // }

                    // if (t.equals(Set.class)) {
                    // Set<?> value = (Set<?>) retrvObj;
                    // for (Object o : value) {
                    // try {
                    // XmlSerializer.serialize(o);
                    // } catch (NullPointerException e) {
                    // fileOut += "Name: " + name + ", Value: " + o.toString() + "\n";
                    // }
                    // }
                    // } else {
                    // try {
                    // XmlSerializer.serialize(retrvObj);
                    // } catch (NullPointerException e) {
                    // fileOut += "Name: " + name + ", Value: " + retrvObj + "\n";
                    // }
                    // }
                }
            }
        }
        return fileOut;
    }

    private static String retriveValue(Field field, Object object)
            throws IllegalArgumentException, IllegalAccessException {

        Type t = field.getType();
        String out = "";

        if (t.equals(Set.class)) {
            Set<?> set = (Set<?>) field.get(object);

            for (Object object2 : set) {
                Field[] f = object2.getClass().getFields();
                for (int i = 0; i < f.length; i++) {
                    out = XmlSerializer.retriveValue(f[i], object2);
                }
            }
        } else {
            Object o = field.get(object);
            out += String.format("Name: %s, Value: %s\n", field.getName(), (String) o);
        }
        return out;
    }
}