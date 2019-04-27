package strings;
/**
 * @author U6044324
 * Oct 23, 2018
 * 
 * Java program to demonstrate conversion from  
// String to StringBuffer and StringBuilder.
 */
public class StringBuilderAndStringBufferClass02 {

	public static void main(String[] args) {
		String str = "Geeks";
		
		// Conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
		
		// Conversion from String Object to StringBuilder
		StringBuilder sbl = new StringBuilder(str);
		sbl.append("ForGeeks");
		System.out.println(sbl);
	}
}
