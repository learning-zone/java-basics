package strings;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello World";
	//  String s = new String("Hello World");
		
		// Returns the number of characters in the string.
		System.out.println("String length: " + s.length());
		
		// Returns the character at ith index
		System.out.println("Character at 3rd position: " + s.charAt(3));
		
		// Return the substring from the ith index character to end of string
		System.out.println("Substring: "+s.substring(3));
		
		// Return the substring from i to j-1 index
		System.out.println("Substring: "+ s.substring(2, 5));
		
		// Concatenates string2 to end of string1
		String s1 = "Hello";
		String s2 = " World";
		System.out.println("Concatenated String: "+ s1.concat(s2));
		
		// Returns the index within the string of the first occurrence of the specified string
		String s4 = "Learn Share Learn";
		System.out.println("Index of Share " + s4.indexOf("Share"));
		
		// Returns the index within the string of the first occurrence of the specified string
		// Starting at the specified index
		System.out.println("Index of a: " + s4.indexOf('a', 3));
		
		// Checking equality of Strings
		Boolean out = "Hello".equals("Worlds");
		System.out.println("Checking Equality: " + out);
		out = "Hello".equals("Hello");
		System.out.println("Checking Equality: " + out);
		
		out = "Hello".equalsIgnoreCase("hEllo");
		System.out.println("Checing Equality: " + out);
		
		int out1 = s1.compareTo(s2);
		System.out.println("If s1 = s2 : " + out);
		
		// Converting cases
		String word1 = "Hello World" ;
		System.out.println("Changing to lower Case: " + word1.toLowerCase());
		
		// Converting cases
		String word2 = "Hello World";
		System.out.println("Changing to Upper case: " + word2.toUpperCase());
		
		// Trimming the word
		String word3 = " Learn Share Learn ";
		System.out.println("Trim the word: "+word3.trim());
		
		// Replacing Characters
		String str1 = "Hello ";
		System.out.println("Orginal String: "+ str1);
		String str2 = str1.replace(" ", " World");
		System.out.println("Replaced String: " + str2);
		
	}
}
