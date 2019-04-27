package strings;

import java.text.DecimalFormat;

public class IntegerToStringConversions {

	public static void main(String[] args) {
		int num1 = 12345;
		int num2 = -12345;
		
		String str1 = Integer.toString(num1);
		String str2 = Integer.toString(num2);
		
		System.out.println("String str1: " + str1);
		System.out.println("String str2: " + str2);
		
		// Convert using String.valueOf(int)
		String str3 = String.valueOf(num1);
		System.out.println("Using valueOf(): " + str3);
		
		// Convert using Integer(int).toString()
		String str4 = new Integer(num1).toString();
		System.out.println("Integer to String: " + str4);
		
		// Convert using DecimalFormat
		DecimalFormat df = new DecimalFormat("#,###");
		String str5 = df.format(num1);
		System.out.println("Decimal Format: "+str5);
		
		// Convert using StringBuffer to StringBuilder
		String str6 = new StringBuffer().append(num1).toString();
		System.out.println("StringBuffer to StringBuilder: "+ str6);
		
		// Convert with special radix
		String bs = Integer.toBinaryString(5);
		System.out.println("Integer to Binary: " + bs);
		
		// Convert Decimal to Octal
		String os = Integer.toOctalString(255);
		System.out.println("Decimal to Octal: " + os);
		
		// Convert Decimal to Hexadecimal
		String hs = Integer.toHexString(255);
		System.out.println("Decimal to Hexadecimal: " + hs);
		
		// Custom Base/Radix
		String cs = Integer.toString(num1, 7);
		System.out.println("Decimal to custom Base: " + cs);	
	}
}
