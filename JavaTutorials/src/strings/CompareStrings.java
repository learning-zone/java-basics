package strings;

public class CompareStrings {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Ram";
		String s3 = new String("Ram");
		String s4 = new String("Ram");
		String s5 = "Shyam";
		String s6 = null;
		String s7 = null;
		
		try {
			
			System.out.println("\nComparing String with equals(): ");
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			System.out.println(s3.equals(s4));
			//System.out.println(s6.equals(s7)); // NullPointerException
			
			System.out.println("\nComparing String with ==:");
			System.out.println(s1 == s2);
			System.out.println(s1 == s3);
			System.out.println(s1 == s4);
			System.out.println(s6 == s7);
			
			System.out.println("\nComparing String with compareTo():");
			System.out.println(s1.compareTo(s3));
			System.out.println(s1.compareTo(s5));
			//System.out.println(s6.compareTo(s7)); // NullPointerException
		
		} catch (Exception e) {
			System.out.println("Exception: " + e);
			e.printStackTrace();
		}
	}
}
