package misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortATextFile {

	public static void main(String[] args) throws Exception {
		String inputfile = "input.txt";
		String outputfile = "output.txt";

		FileReader fileReader = new FileReader(inputfile);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String inputLine;
		List<String> lineList = new ArrayList<String>();
		while ((inputLine = bufferReader.readLine()) != null) {
			lineList.add(inputLine);
		}
		fileReader.close();
		Collections.sort(lineList);

		FileWriter fileWriter = new FileWriter(outputfile);
		PrintWriter out = new PrintWriter(fileWriter);
		for (String outputLine : lineList) {
			out.println(outputLine);
		}

		out.flush();
		out.close();
		fileWriter.close();
	}
}
