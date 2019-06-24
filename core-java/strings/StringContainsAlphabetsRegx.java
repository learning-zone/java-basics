package strings;

public class StringContainsAlphabetsRegx {
	
	public static boolean isStringContainsAlpabets(String str) {
		return ((str !=null) 
				&& (!str.equals("") 
				&& (str.matches("^[a-zA-Z]*$"))));
	}

	public static void main(String[] args) {
		String str = "HelloWorld";
		System.out.println("Input: " + str);
		System.out.println("Output: "+ isStringContainsAlpabets(str));
	}
}
