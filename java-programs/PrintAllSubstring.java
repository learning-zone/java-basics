package misc;

public class PrintAllSubstring {

	public static void PrintSubstring(String str, int length) {

		System.out.println("All Substring of ABC are: ");
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j <= length; j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

	public static void main(String[] args) {

		PrintSubstring("ABC", "ABC".length());
	}
}
