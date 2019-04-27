package strings;

public class StringsToIntegerConversions {

	public static void main(String[] args) {
		int d = Integer.parseInt("20");
		int sp = Integer.parseInt("+20");
		int sn = Integer.parseInt("-20");
		int r = Integer.parseInt("20", 16); // (2)*16^1 + (0)*16^0 = 32
		int str = Integer.parseInt("A", 12); // Output 10 
                                              
		System.out.println("Decimal Number: " +d );
		System.out.println("Signed Positive Number: " +sp);
		System.out.println("Signed Negative Number: "+sn);
		System.out.println("Radix Number: "+r);
		System.out.println("String Number: "+str); 
	}
}
