package keywords;

public class ReferenceFinalVariable {

	public static void main(String[] args) {
		final StringBuilder sb = new StringBuilder("Hello ");
		
		System.out.println(sb);
		
		// Changing internal state of object
		sb.append("World !");
		System.out.println(sb);
	}
}
