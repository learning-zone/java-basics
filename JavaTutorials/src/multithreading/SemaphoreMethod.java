package multithreading;

import java.util.concurrent.*;

class Shared {
	static int count = 0 ;
}
public class SemaphoreMethod extends Thread {

	Semaphore sem;
	String threadName;
	
	public SemaphoreMethod(Semaphore sem, String threadName) {
		super(threadName);
		this.sem = sem;
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		 // run by thread A 
		if(this.getName().equals("A")) {
			System.out.println("Starting " + threadName);
			
			try {
				System.out.println(threadName + " is waiting for a permit.");
				// acquiring the lock
				sem.acquire();
				System.out.println(threadName + " gets a permit.");
				
				for(int i = 0; i < 5; i++) {
					Shared.count++;
					System.out.println(threadName + ": " + Shared.count);
					Thread.sleep(100);
				}
			} catch (Exception e) {
				System.out.println("Exception: "+e);
			}
			
			System.out.println(threadName + " releases the permit.");
			sem.release();
		} else {  // run by thread B
			System.out.println("String " + threadName);
			
			try {
				System.out.println(threadName + " is waiting for a permit");
				
				sem.acquire();
				System.out.println(threadName + " gets a permit");
				
				for(int i = 0; i < 5; i++) {
					Shared.count--;
					System.out.println(threadName + ": " + Shared.count);
					
					Thread.sleep(100);
				}
			} catch (Exception e) {
				System.out.println("Exception: " +e);
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		Semaphore sem = new Semaphore(1);
		
		SemaphoreMethod mt1 = new SemaphoreMethod(sem, "A");
		SemaphoreMethod mt2 = new SemaphoreMethod(sem, "B");
		
		// stating threads A and B 
		mt1.start();
		mt2.start();
		// waiting for threads A and B 
		mt1.join();
		mt2.join();
		
		System.out.println("Count: " + Shared.count);
	}
}
 