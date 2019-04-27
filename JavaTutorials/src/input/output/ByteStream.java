package input.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {

		try (
			FileInputStream sourceStream = new FileInputStream("file.txt");
			FileOutputStream targetStream = new FileOutputStream("target.txt"); ) {
			
			int temp;
			while((temp = sourceStream.read()) != -1) {
				targetStream.write((byte)temp);
				System.out.println("Writing into a file: " + (char)temp);
			}
			
		} catch(Exception e) {
			System.out.println("Exception: "+ e);
			e.printStackTrace();
		}
	}
}
