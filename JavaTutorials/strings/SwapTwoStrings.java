package strings;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		
		System.out.println("String before swap: a = "+ a + " and b = " + b);
		
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		
		// Store initial string b in String a
		a = a.substring(b.length());
		
		// print String after swapping
		System.out.println("String after swap: a = "+ a + " and b = " + b);
	}
}
