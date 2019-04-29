package oopsconcepts;

public class thisToReferCurrentClassInstanceVariables {

	int a, b;
	thisToReferCurrentClassInstanceVariables(int a, int b) {
		this.a = a;
		this.b = b;
	}
	void display() {
		System.out.println("a = "+ a + " b = "+b);
	}
	public static void main(String[] args) {
		thisToReferCurrentClassInstanceVariables obj = new thisToReferCurrentClassInstanceVariables(10, 20);
		obj.display();
	}
}
