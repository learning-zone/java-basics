package strings;

public class CheckAlphabetsInString {
	
	public static boolean isStringContainsAlphabet(String str) {
		return ((str != null) && (!str.equals("") && (str.chars().allMatch(Character::isLetter))));
	}

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println("Input: "+str);
		System.out.println("Output: "+isStringContainsAlphabet(str));
	}
}
