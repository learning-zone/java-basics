package input.output;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author U6044324
 * Oct 31, 2018
 * 
 * Java Program to read a file in a human readable
 * format using FileReader
 */
public class CharacterStream {

	public static void main(String[] args) throws IOException {
	
		try (
			FileReader sourceStream = new FileReader("file.txt"); ) {
			
			// Readind sourcefile and writing content to 
			// target file character by character.
			int temp;
			while((temp = sourceStream.read()) != -1){
				System.out.print((char)temp);
			}
		} catch( Exception e) {
			System.out.println("Exception: " + e);
			e.printStackTrace();
		}
	}
}
