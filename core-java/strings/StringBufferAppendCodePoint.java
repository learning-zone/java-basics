package strings;

public class StringBufferAppendCodePoint {

	public static void main(String[] args) {
		StringBuffer obj = new StringBuffer("Hello World");
		
		obj.appendCodePoint(115); // ASCII value of 's'
		System.out.println("After appending codePoint: " +obj);
	}
}
