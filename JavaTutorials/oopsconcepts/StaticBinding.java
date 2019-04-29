package oopsconcepts;

public class StaticBinding {
	
	public static class SupperClass {
		static void print() {
			System.out.println("Print in Supper Class");
		}
	}
	public static class SubClass extends SupperClass {
		static void print() {
			System.out.println("Print in Sub Class");
		}
	}
	public static void main(String[] args) {
		SupperClass A = new SupperClass();
		SupperClass B = new SubClass();
		A.print();
		B.print();
	}
}
