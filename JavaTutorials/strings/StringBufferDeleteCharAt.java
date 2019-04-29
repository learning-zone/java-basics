package strings;

public class StringBufferDeleteCharAt {

	public static void main(String[] args) {
		StringBuffer obj = new StringBuffer("Hello Worlds");
		
		obj.deleteCharAt(11);
		System.out.println("After deletion of character: " + obj);
	}
}
