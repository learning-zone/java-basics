package oopsconcepts;

class Parent1 {
	void show() throws RuntimeException {
		System.out.println("Parent Class");
	}
}

class Child1 extends Parent1 {
	void show() throws ArithmeticException {
		System.out.println("Child Class");
	}
}

public class OverridingExceptionHandling {

	public static void main(String[] args) {
		Parent1 obj = new Child1();
		obj.show();

	}

}
