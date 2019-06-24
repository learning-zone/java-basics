package multithreading;

public class StartExample extends Thread {

	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught: " + e);
		}
	}
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {		
			StartExample obj = new StartExample();
			obj.start();
		}
	}
}
