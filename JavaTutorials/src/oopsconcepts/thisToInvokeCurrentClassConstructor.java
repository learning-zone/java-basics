package oopsconcepts;

public class thisToInvokeCurrentClassConstructor {
	
	int a, b;
	// Default constructor
	thisToInvokeCurrentClassConstructor() {
		this(10, 20);
		System.out.println("Inside default constructor \n");
	}
	
	thisToInvokeCurrentClassConstructor(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor");
	}

	public static void main(String[] args) {
		thisToInvokeCurrentClassConstructor obj = new thisToInvokeCurrentClassConstructor();
	}
}
