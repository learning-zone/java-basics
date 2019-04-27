package oopsconcepts;

class OuterClass {
	private static String msg = "Hello Java";
	
	// Static nested class
	public static class NestedStaticClass {
		// Only static members of Outer class is directly accessible in nested static class
		public void printMessage() {
			System.out.println("Message from nested static class: " + msg);
		}
	}
	// non-static nested class - also called Inner class
	public class InnerClass {
		// Both static and non-static members of Outer class are accessible in this Inner class
		public void display() {
			System.out.println("Message from non-static nested class: " + msg);
		}
	}
}

public class StaticClass {

	public static void main(String[] args) {
		OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
		
		printer.printMessage();
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		inner.display();
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
		innerObject.display();

	}

}
