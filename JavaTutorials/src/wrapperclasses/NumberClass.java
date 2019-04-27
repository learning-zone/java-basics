package wrapperclasses;

public class NumberClass {

	public static void main(String[] args) {
		Double d = new Double("6.9685");
		
		byte b = d.byteValue();
		Integer i = new Integer("10");
			
		System.out.println("After conversion to byte: " + b); // 6
		System.out.println("Compare: " + i.compareTo(7));  // 1 >> greater 
		System.out.println("Compare: " + i.compareTo(11)); // -1 >> less
		System.out.println("Compare: " + i.compareTo(10)); // 0 >> equal
		System.out.println("Equals: " + i.equals(10));    // true
		System.out.println("ParseInt: " + Integer.parseInt("101", 2));  // 5
		System.out.println("ParseInt: " + Integer.toBinaryString(10));  // 1010
		System.out.println("ParseInt: " + Integer.valueOf(33));  // 33
		System.out.println("Letter Character Class: "+ Character.isLetter('A')); // true
		System.out.println("Digit Character Class: "+ Character.isDigit('0'));  // true
		System.out.println("Whitespace Character Class: "+ Character.isWhitespace('9')); 
	}
}
