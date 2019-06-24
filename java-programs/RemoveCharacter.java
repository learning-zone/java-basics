package misc;

public class RemoveCharacter {

	public static void main(String[] args) {

		String str1 = "Hello World";
		System.out.println("String after removing 'World' = " + str1.replace("World", ""));

		String str2 = "Hello World";
		System.out.println("String after removing first 'o' = " + str2.replaceFirst("o", ""));

		String str3 = "Hello World";
		System.out.println("String after replacing all small letters = " + str3.replaceAll("([a-z])", ""));
	}
}
