package strings;

public class StringContainsAlphabets {
	
	public static boolean isStringContainsAlphabets(String str) {
		if(str == null || str.equals("")) {
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((!(ch >= 'A' && ch <= 'Z'))  && (!(ch >= 'a' && ch <= 'z'))) { 
	                return false; 
	        } 
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str = "HelloWorld";
		System.out.println("Input: "+ str);
		System.out.println("Output: " + isStringContainsAlphabets(str));

	}
}
