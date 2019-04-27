package multithreading;

import java.io.*;

public class JoinMethod extends Thread {

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Thread Start: " + Thread.currentThread().getName());
			} catch (Exception e) {
				System.out.println("Exception: " + e);
			}
		}
	}
	public static void main(String[] args) {
		JoinMethod t1 = new JoinMethod();
		JoinMethod t2 = new JoinMethod();
		
		
		t1.start();
		try {
			System.out.println("Thread Ends: " + Thread.currentThread().getName());
			t1.join();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		
		t2.start();
		try {
			System.out.println("Thread Ends: " + Thread.currentThread().getName());
			t2.join();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
