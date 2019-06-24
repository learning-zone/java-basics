package concurrent;

import java.util.concurrent.*;

public class ConcurrentSemaphore extends Thread {

	Semaphore sem;
	String threadName;
	public ConcurrentSemaphore(Semaphore sem, String threadName) {
		super(threadName);
		this.sem = sem;
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		System.out.println(threadName + " is waiting for a permit.");
		
		try {
			sem.acquire();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(threadName + " gets a permit.");
		for(int i = 0; i < 2; i++) {
			boolean b =sem.hasQueuedThreads();
			if(b) {
				System.out.println("Length of Queue: " + sem.getQueueLength());
			}
			
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(threadName + " releases the permit.");
		
		sem.release();
	}
	public static void main(String[] args) {
		
		Semaphore sem = new Semaphore(3, true);
		
		System.out.println("Is fairness enabled: " + sem.isFair());
		
		sem.tryAcquire(2);
		System.out.println("Avaialable permits: " + sem.availablePermits());
		System.out.println("Number of permits drain by Main thread: " +sem.drainPermits());
		
		sem.release(1);
		
		ConcurrentSemaphore mt1 = new ConcurrentSemaphore(sem, "A");
		ConcurrentSemaphore mt2 = new ConcurrentSemaphore(sem, "B");
		
		mt1.start();
		mt2.start();
		System.out.println(sem.toString());
		
		try {
			mt1.join();
			mt2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
