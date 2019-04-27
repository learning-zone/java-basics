package multithreading;

public class MultithreadingUsingRunnable implements Runnable {

	public void run() {
		try {
			System.out.println("Thread " +Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			Thread obj =  new Thread(new MultithreadingUsingRunnable());
			obj.start();
		}
	}
}
