package strings;

import java.util.Locale;

public class StringToLowerCase {

	public static void main(String[] args) {
		String s = "I Know YOU BuT You Don't Know ME."; 
		
		Locale TURKISH = Locale.forLanguageTag("tr");
		Locale ENGLISH = Locale.forLanguageTag("en");
		
		String str1 = s.toLowerCase(TURKISH);
		String str2 = s.toLowerCase(ENGLISH);
		System.out.println("String LowerCase: "+ str1);
		System.out.println("String LowerCase: "+ str2);
		

	}

}
