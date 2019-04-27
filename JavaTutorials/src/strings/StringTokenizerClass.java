package strings;

import java.util.StringTokenizer;
/**
 * StringTokenizer class in Java is used to break a string into tokens.
 * @author U6044324
 * Oct 23, 2018
 */

public class StringTokenizerClass {

	public static void main(String[] args) {
		System.out.println("\nUsing Constructor 1: ");
		StringTokenizer st1 = new StringTokenizer("Hello Geeks How are you", " ");
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println("\nUsing Constructor 2: ");
		StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", " :");
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("\nUsing Constructor 3: ");
		StringTokenizer st3 = new StringTokenizer("JAVA : Code : String" , " :", true);
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}
}
