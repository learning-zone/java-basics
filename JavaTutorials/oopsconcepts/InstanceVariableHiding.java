package oopsconcepts;

class InstanceClass {
	private int value = 10;
	void method() {
		int value = 40;
		System.out.println("Value of Instance varibale: "+this.value);
		System.out.println("Value of Local varibale: "+ value);
	}
}

public class InstanceVariableHiding {

	public static void main(String[] args) {
		InstanceClass obj = new InstanceClass();
		obj.method();
	}
}
