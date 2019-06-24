package strings;
/**
 * @author U6044324
 * Oct 23, 2018
 * 
 * Java program to demonstrate difference between String, 
 * StringBuilder and StringBuffer
 */

public class StringBuilderAndStringBufferClass {
	
	// Concatenates to String
	public static void concat1(String s1) {
		s1 = s1 + "forgeeks";
	}
	
	// Concatenates to StringBuilder
	public static void concat2(StringBuilder s2) {
		s2.append("forgeeks");
	}
	
	// Concatenates to StringBuffer
	public static void concat3(StringBuffer s3) {
		s3.append("forgeeks");
	}

	public static void main(String[] args) {
		String s1 = "Geeks";
		concat1(s1);
		System.out.println("String: " + s1);
		
		StringBuilder s2 = new StringBuilder("Geeks");
		concat2(s2);
		System.out.println("StringBuilder: " + s2);
		
		StringBuffer s3 = new StringBuffer("Geeks");
		concat3(s3);
		System.out.println("StringBuffer: " + s3);
	}
}
