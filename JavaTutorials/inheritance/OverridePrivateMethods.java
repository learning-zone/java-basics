package inheritance;


public class OverridePrivateMethods {
	
	private String msg = "Hello World";
	private void fun() {
		System.out.println("Outer function");
	}
	
	class Inner extends OverridePrivateMethods {
		private void fun() {
			System.out.println("Accessing Private Member of Outer: "+ msg);
		}
	}

	public static void main(String[] args) {
		/**
		 * In Order to create instance of Inner Class, we need an Outer
		 * class instance. So, first create Outer class instance and then
		 * Inner class instance.
		 */
		OverridePrivateMethods o = new OverridePrivateMethods();
		Inner i = o.new Inner();
		
		/**
		 * This will call Inner's fun(), the purpose of this call is to 
		 * show that private members of Outer can be accessed in Inner
		 */
		 i.fun();
		 // o.fun() calls Outer's fun 
		 o = i;
		 o.fun();
	}
}
