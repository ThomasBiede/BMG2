package app;

import app.annotations.XmlSerializer;
import app.hl7_types.message.ADT_A01;
import app.parsing.Reader;

/**
 * @author Daniel Karner
 */
public class TestClass {
	public static void main(String[] args) {
		try {
			ADT_A01 a = new ADT_A01(Reader.readFile("/home/thomasbiede/Desktop/BMG2/HL7/src/test.txt"));
			String output = XmlSerializer.serialize(a);			
			System.out.println(output);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}