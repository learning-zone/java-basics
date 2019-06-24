package multithreading;

import java.util.Scanner;
import java.util.*;

public class InterThreadCommunication  {

	public static void main(String[] args) throws InterruptedException {
		
		final PC pc = new PC();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
		t1.join();
		t2.join();
	}
	
	public static class PC {
		public void produce() throws InterruptedException {
			// Synchronized block ensure only one thread running at a time
			synchronized(this) {
				System.out.println("Producer thread running");
				
				// release the lock on shared resource
				wait();
				System.out.println("Resumed");
			}
		}
		
		public void consume() throws InterruptedException {
			Thread.sleep(1000);
			Scanner s = new Scanner(System.in);
			
		    synchronized(this) {
		    	System.out.println("Waiting for return key");
		    	s.nextLine();
		    	System.out.println("Return key pressed");
		    	
		    	notify();
		    	
		    	Thread.sleep(2000);
		    }
		}
	}

}
