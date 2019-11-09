package app;

import app.hl7_parser.XmlSerializer;
import app.hl7_types.message.ADT_A01;
import app.parsing.Reader;

/**
 * @author Daniel Karner
 */
public class TestClass {
	public static void main(String[] args) {
		try {
			// C:/Users/thoma/Desktop/Prog-Git/BMG2/HL7/src/test.txt
			// /home/thomasbiede/Desktop/BMG2/HL7/src/test.txt
			ADT_A01 a = new ADT_A01(Reader.readFile("/home/thomasbiede/Desktop/BMG2/HL7/src/test.txt"));
			// System.out.println(a);
			String output = XmlSerializer.parse(a);			
			System.out.println(output);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}