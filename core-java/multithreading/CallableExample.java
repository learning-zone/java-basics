package multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableExample implements Callable {

	public Object call() throws Exception {
		Random generator = new Random();
		Integer randomNumber = generator.nextInt(5);
		Thread.sleep(randomNumber * 100);
		
		return randomNumber;
	}
	
	public static void main(String args[]) throws Exception {
		FutureTask[] randomNumberTasks = new FutureTask[5];
		
		for(int i = 0; i < 5; i++) {
			Callable callable = new CallableExample();
			randomNumberTasks[i] = new FutureTask(callable);
			Thread t = new Thread(randomNumberTasks[i]);
			t.start();
		}
		for(int i = 0; i < 5; i++){
			System.out.println("FutureTask: "+randomNumberTasks[i].get());
		}
	}
}


