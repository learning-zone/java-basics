package input.output;

import java.util.Scanner;

public class ScannerNextChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		System.out.println("First Character: " + c);
	}
}
