package oopsconcepts;

class Parent {
	void show() {
		System.out.print("Parent Class");
	}
}

class Child extends Parent {
	@Override
	void show() {
		super.show();
		System.out.println("\nChild Class");
	}
}
public class Overriding01 {

	public static void main(String[] args) {
		Parent obj = new Child();
		obj.show();

	}

}
