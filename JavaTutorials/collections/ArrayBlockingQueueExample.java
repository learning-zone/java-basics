package collections;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {

	public static void main(String[] args) {

		int capacity = 20;
		
		// Create object of ArrayBlockingQueue
		ArrayBlockingQueue<Integer> BQ = new ArrayBlockingQueue<Integer>(capacity);
		
		BQ.add(10);
		BQ.add(20);
		BQ.add(30);
		System.out.println("ArrayBlockingQueue: " + BQ);
		
		BQ.clear();
		System.out.println("ArrayBlockingQueue: " + BQ);

	}

}
