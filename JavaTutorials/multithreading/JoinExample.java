package multithreading;

public class JoinExample implements Runnable {

	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Current Thread: " + t.getName());
		
		System.out.println("Is Alive? " + t.isAlive());
	}
	public static void main(String[] args) {
		Thread t = new Thread(new JoinExample());
		t.start();
		
		try {
			// Waits for 1000ms this thread to die
			t.join(1000);
		} catch (Exception e) {
			System.out.print(e);
		}
		
		System.out.println("Current Thread: " + t.getName());
		System.out.println("Is Alive? " + t.isAlive());
	}
}
