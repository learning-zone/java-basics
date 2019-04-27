package collections;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {

	public static void main(String[] args) {
		
		LinkedBlockingQueue<Integer> lbq  = new LinkedBlockingQueue<Integer>();
		
		// add numbers
		lbq.add(10);
		lbq.add(20);
		lbq.add(30);

		System.out.println("LinkedBlockingQueue: " + lbq);
	}

}
