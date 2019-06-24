package strings;

public class SplitMethod {

	public static void main(String[] args) {
		String str = "geekss@for@geekss";
		String str2 = "word1, word2 word3@word4?word5.word6";
		
		String[] arrOfStr = str.split("@", 2);
		String[] arrOfStr2 = str.split("[, ?.@]+");
		
		for (String a: arrOfStr2) {
			System.out.println(a);
		}
	}
}
