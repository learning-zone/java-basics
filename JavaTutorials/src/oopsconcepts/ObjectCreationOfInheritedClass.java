package oopsconcepts;

class Fruit {
	public Fruit() {
		System.out.println("Super Class Constructor");
		System.out.println("Super Class object hascode: " + this.hashCode());
		System.out.println(this.getClass().getName());
	}
}

class Apple extends Fruit {
	public Apple() {
		System.out.println("Subclass Constructor invoked");
		System.out.println("Sub Class Object hascode: "+ this.hashCode());
		System.out.println(this.hashCode() + "    "+ super.hashCode());
		System.out.println(this.getClass().getName() + "   "+ super.getClass().getName());
	}
}

public class ObjectCreationOfInheritedClass {

	public static void main(String[] args) {
		Apple obj = new Apple();
	}

}
