package oopsconcepts;

public class thisAsMethodParameter {
	
	int a, b;
	thisAsMethodParameter() {
		a = 10;
		b = 20;
	}
	void display(thisAsMethodParameter obj) {
		System.out.println("a = " + a + " b = " +b);
	}
	void get() {
		display(this);
	}

	public static void main(String[] args) {
		thisAsMethodParameter obj = new thisAsMethodParameter();
		obj.get();
	}
}
