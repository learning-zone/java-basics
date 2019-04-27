package inheritance;

class Base01 {
	public int fun(int i) {
		System.out.println("Base Class fun");
		return i + 3;
	}
}
class Derived01 extends Base01 {
	public double fun(double i) {
		System.out.println("Derived Class fun");
		return i + 3.3;
	}
}
public class OverloadingInInheritance {

	public static void main(String[] args) {
		Derived01 obj = new Derived01();
		System.out.println(obj.fun(3));
		System.out.println(obj.fun(3.3));
	}
}
