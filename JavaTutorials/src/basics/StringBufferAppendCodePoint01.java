package basics;

public class StringBufferAppendCodePoint01 {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("Pradee");
		System.out .println("String buffer: " +sbf);
		
		sbf.appendCodePoint(112); //p
		System.out.println("After appending CodePoint: "+sbf);
	}

}
