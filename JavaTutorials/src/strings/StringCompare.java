package strings;

import java.util.Objects;

public class StringCompare {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String str3 = "hello";
		String str4 = new String("Hello");
		
		System.out.println("Comparing " + str1 + " and " + str2 + " : " + str1.equals(str2)); // false
		System.out.println("Comparing " + str1 + " and " + str3 + " : " + str1.equalsIgnoreCase(str3)); // true
		System.out.println("Comparing " + str1 + " and " + str4 + " : " + Objects.equals(str1, str4)); // true
		System.out.println("Comparing " + str1 + " and " + str4 + " : " + str1.compareTo(str4)); // 0
		System.out.println("Comparing " + str1 + " and " + str4 + " : " + (str1 == str4)); // false
	}
}
