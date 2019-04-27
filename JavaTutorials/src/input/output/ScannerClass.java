package input.output;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// String input
		String name = sc.nextLine();
		
		// Character Input
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		long mobileNo = sc.nextLong();
		double cgpa = sc.nextDouble();
		
		System.out.println("Name: " +name);
		System.out.println("Gender: " +gender);
		System.out.println("Age: "+age);
		System.out.println("Mobile Number: "+mobileNo);
		System.out.println("CGPA: "+cgpa);
	}
}
