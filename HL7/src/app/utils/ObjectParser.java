package app.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ObjectParser
 * 
 * @author Thomas Biedermann
 * @version 1.0
 * @since 2019-10-31
 */
public abstract class ObjectParser {
    public static void toXML(Object obj, String fileName) {
        try {
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(fileName));

            System.out.println(obj.getClass().getDeclaredFields());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
}