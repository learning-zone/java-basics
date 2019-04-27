package multithreading;

public class ThreadNaming extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		
		ThreadNaming t1 = new ThreadNaming();
		ThreadNaming t2 = new ThreadNaming();

		System.out.println("Thread 1: "+ t1.getName());
		System.out.println("Thread 2: "+ t2.getName());
		
		t1.start();
		t2.start();
		
		t1.setName("One");
		t2.setName("Two");
		
		System.out.println("Thread 1 after change: " + t1.getName());
		System.out.println("Thread 2 after change: " + t2.getName());
	}

}
