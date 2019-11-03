package app.parsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Daniel Karner
 */
public class Reader 
{
	/**
	 * @param filename
	 * @return Entire String from text file
	 * @throws IOException
	 */
	public static String readFile(String filename) throws IOException 
	{
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String file = "";
		String buffer;
		while((buffer = br.readLine()) != null) 
			file += buffer+"\n";
		br.close();
		return file;
	}

}
