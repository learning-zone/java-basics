package misc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MostRepeatedWord {

	public static void main(String[] args) {
		String line, word = "";
		int count = 0, maxCount = 0;
		ArrayList<String> words = new ArrayList<String>();

		// Opens file in read mode
		FileReader file;
		try {
			file = new FileReader("file.txt");
			BufferedReader br = new BufferedReader(file);

			// Reads each line
			try {
				while ((line = br.readLine()) != null) {
					String string[] = line.toLowerCase().split("([,.\\s]+)");
					for (String s : string) {
						words.add(s);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Determine the most repeated word in a file
		for (int i = 0; i < words.size(); i++) {
			count = 1;
			for (int j = i + 1; j < words.size(); j++) {
				if (words.get(i).equals(words.get(j))) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				word = words.get(i);
			}
		}
		System.out.println("Most Repeated words: " + word);
	}
}
