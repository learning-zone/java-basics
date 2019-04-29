package inheritance;

class Base02 {
	private final void message() {
		System.out.println("Base Class Message");
	}
}
public class Inheritance01 extends Base02 {

	public final void message() {
		System.out.println("Child Class Message");
	}
	public static void main(String[] args) {
		new Inheritance01().message();
	}
}
