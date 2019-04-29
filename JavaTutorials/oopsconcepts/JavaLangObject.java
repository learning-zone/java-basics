package oopsconcepts;

public class JavaLangObject {

	public static void main(String[] args) {
		Object y;
		
		y = 'A';
		System.out.println(y.getClass().getName());
		
		y = "Hello";
		System.out.println(y.getClass().getName());
	}
}
