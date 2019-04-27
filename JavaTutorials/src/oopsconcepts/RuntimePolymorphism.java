package oopsconcepts;

class A {
	int x = 10;
}

class B extends A {
	int x = 20;
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.x);
	}
}
