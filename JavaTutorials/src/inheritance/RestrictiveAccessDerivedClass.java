package inheritance;

class Base {
	private void foo() {
		System.out.print("Base Class Method");
	}
}

class Derived extends Base {
	public void foo() {
		System.out.print("Derived Class Method");
	}
}

public class RestrictiveAccessDerivedClass {

	public static void main(String[] args) {
		Derived d = new Derived();
		d.foo();
	}
}
