package misc;

public class ConvertLowerToUpperCase {

	public static void toLowerCase(String str) {
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			if (character >= 65 && character <= 90) {
				character = (char) ((character + 32));
			}
			System.out.print(character);
		}
	}

	public static void main(String[] args) {
		String str = "HELLO WORLD";
		toLowerCase(str);
	}
}
