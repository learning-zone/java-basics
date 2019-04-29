package inheritance;

class Base03 {
	static String s = "";
	protected Base03() {
		s += " Base Class Message!\n";
	}
}

class Child02 extends Base03 {
	private Child02() {
		s += " Child Class Message!\n";
	}
}

public class Inheritance02 extends Base03 {
	
	private Inheritance02() {
		s += " Grand Child Class Message!\n";
	}
	public static void main(String[] args) {
		new Inheritance02();
		System.out.println(s);
	}
}
