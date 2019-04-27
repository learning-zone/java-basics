package oopsconcepts;

public class thisToInvokeCurrentClassMethod {
	
	void display() {
		this.show();
		System.out.println("Inside display method");
	}
	void show() {
		System.out.println("Inside show method");
	}

	public static void main(String[] args) {
		thisToInvokeCurrentClassMethod obj = new thisToInvokeCurrentClassMethod();
		obj.display();
	}
}
