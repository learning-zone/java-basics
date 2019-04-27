package multithreading;

public class SleepExample implements Runnable {

	Thread t;
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
		    }
		}
	}
	public static void main(String[] args) {
		Thread t = new Thread(new SleepExample());
		t.start();
		
		Thread t2 = new Thread(new SleepExample());
		t2.start();
	}
}
