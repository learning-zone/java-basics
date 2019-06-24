package oopsconcepts;

public class Finalize {

	public static void main(String[] args) {
		Finalize f = new Finalize();
		System.out.println(f.hashCode());
		f = null;
		// Calling garbage collector
		System.gc();
		System.out.println("End");
	}
	@Override
	protected void finalize() {
		System.out.println("Finalize method called");
	}
}
