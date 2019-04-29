package misc;

public class SingletonClassMain {

	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		obj1.message("Pradeep");
		obj2.message("Kumar");
	}
}
