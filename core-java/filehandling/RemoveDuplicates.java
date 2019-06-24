package filehandling;

/**
 * use HashSet to store each line of input.txt. 
 * As set ignores duplicate values, so while storing a line,
 * check if it already present in hashset. Write it to output.txt 
 * only if not present in hashset.
 */

import java.io.*;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) throws IOException {
				
		try (   
				PrintWriter pw = new PrintWriter("Output.txt");
				BufferedReader br = new BufferedReader(new FileReader("file.txt"));) {
			String line = br.readLine();
			
			// Set store unique values
			HashSet<String> hs = new HashSet<>();
			while(line != null) {
				if(hs.add(line)) {
					pw.println(line);
				}
				line = br.readLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("File operation performed successfully");
	}
}
