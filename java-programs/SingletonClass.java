package misc;

public class SingletonClass {

	private static SingletonClass instance;
	
	public synchronized static SingletonClass getInstance() {
		if(instance == null) {
			instance = new SingletonClass();
			System.out.println("Object created...!");
		} else {
			System.out.println("Object already exists.");
		}
		return instance;
	}
	public void message(String str) {
		System.out.println("Message function called, Hello "+str);
	}
}
