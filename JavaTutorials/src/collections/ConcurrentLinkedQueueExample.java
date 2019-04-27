package collections;

import java.util.concurrent.*;

public class ConcurrentLinkedQueueExample {

	public static void main(String[] args) {
		
		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();
		
		clq.add(10); 
		clq.add(20);
		clq.add(30);
		clq.add(40);
		clq.add(50);
		
		// Display the existing LinkedQueue
		System.out.println("ConcurrentLinkedQueue: " + clq);
		
		// Display the first element
		System.out.println("First element is: "+ clq.peek());
		
		// Remove the first element
		System.out.println("Head Element is: " + clq.poll());
		
		// Display the existing LinkedQueue
		System.out.println("ConcurrentLinkedQueue: " + clq);
		
		// Get the size
		System.out.println("Size: " + clq.size());	
	}
}
