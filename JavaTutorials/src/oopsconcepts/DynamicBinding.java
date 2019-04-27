package oopsconcepts;

public class DynamicBinding {
	
	public static class SupperClass {
		void print() {
			System.out.println("Print in Super Class");
		}
	}
	public static class SubClass extends SupperClass {
		@Override
		void print() {
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
