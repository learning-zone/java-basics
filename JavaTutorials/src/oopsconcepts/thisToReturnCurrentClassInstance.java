package oopsconcepts;

public class thisToReturnCurrentClassInstance {
	
	int a, b;
	
	thisToReturnCurrentClassInstance() {
		a  = 10;
		b = 20;
	}
	thisToReturnCurrentClassInstance get() {
		return this;
	}
	
	void display() {
		System.out.println("a = " + a + " b = "+b);
	}

	public static void main(String[] args) {
		thisToReturnCurrentClassInstance obj = new thisToReturnCurrentClassInstance();
		obj.get().display();
	}
}
