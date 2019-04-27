package oopsconcepts;

public class OverloadMain {

	public static void main(String[] args) {
		System.out.println("Normal Main()");
		OverloadMain.main("Hi");
	}
	public static void main(String arg1) {
		System.out.println(arg1);
		OverloadMain.main("Hello", "Hello World!");
	}
	public static void main(String arg1, String arg2){
		System.out.println(arg1 +", "+ arg2);
	}
}
