package multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPools implements Runnable {
	
	private String name;
	
	public ThreadPools(String s) {
		name = s;
	}
	
	public void run() {
		try {
			for(int i = 0; i < 3; i++) {
				if(i == 0) {
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization Time for task name: " + name + " = " + ft.format(d));
				} else {
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Executing Time for task name: " + name + " = " + ft.format(d));
				}
				Thread.sleep(1000);
			}
			System.out.println(name + " completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		final int MAX_T = 3;
		
		Runnable r1 = new ThreadPools("task 1");
		Runnable r2 = new ThreadPools("task 2");
		Runnable r3 = new ThreadPools("task 3");

		// Create a thread pool
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.shutdown();
	}
}
