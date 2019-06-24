package misc;

public class StringSwap {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";

		System.out.println("Strings before swap: a = " + a + " and b = " + b);
		a = a + b;
		// Store initial string a in string b
		b = a.substring(0, a.length() - b.length());
		// Store initial string b in string a
		a = a.substring(b.length());
		System.out.println("Strings after swap: a = " + a + " and b = " + b);
	}
}
