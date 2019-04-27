package inheritance;

class Grandparent {
	public void Print() {
		System.out.println("Grandparent's Print");
	}
}

class Parent extends Grandparent {
	@Override
	public void Print() {
		super.Print();
		System.out.println("Parent's Print");
	}
}

class Child extends Parent {
	@Override
	public void Print() {
		super.Print();
		System.out.println("Child Print");
	}
}

public class AccessingGrandparentMember {

	public static void main(String[] args) {
		Child c = new Child();
		c.Print();

	}
}
