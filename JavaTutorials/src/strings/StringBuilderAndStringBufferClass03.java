package strings;
/**
 * @author U6044324
 * Oct 23, 2018
 * 
 * Java program to demonstrate conversion from  
 * String to StringBuffer and StringBuilder.
 */
public class StringBuilderAndStringBufferClass03 {

	public static void main(String[] args) {
		StringBuffer sbr = new StringBuffer("Hello");
		StringBuilder sbdr = new StringBuilder("World");
		
		// Conversion from StringBuffer object to String
		String str = sbr.toString();
		System.out.println("\nStringBuffer object to String: ");
		System.out.println(str);
		
		// Conversion from StringBuilder object to String
		String str1 = sbdr.toString();
		System.out.println("\nStringBuilder object to String: ");
		System.out.println(str1);
		
		sbr.append("ForGeeks");
		System.out.println(sbr);
		System.out.println(str);

	}

}
