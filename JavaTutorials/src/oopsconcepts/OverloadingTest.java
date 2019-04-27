package oopsconcepts;

public class OverloadingTest {
	private String function(String temp, int data) {
		return "Hi";
	}
	public final static String function(int data, String temp) {
		return "Hello";
	}
	public static void main(String[] args) {
		OverloadingTest obj = new OverloadingTest();
		System.out.println(obj.function(4, "Call"));
	}
}
