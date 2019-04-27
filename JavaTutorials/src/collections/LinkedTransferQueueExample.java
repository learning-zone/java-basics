package collections;

import java.util.concurrent.LinkedTransferQueue;
public class LinkedTransferQueueExample {

	public static void main(String[] args) throws InterruptedException {
		
		LinkedTransferQueue<Integer> LTQ = new LinkedTransferQueue<Integer>();
		
		LTQ.add(123456);
		LTQ.add(289537);
		LTQ.add(789239);
		LTQ.add(234298);
		LTQ.add(873928);
		
		System.out.println("Linked Tranfer Queue: " + LTQ);
		
		System.out.println("Size of Linked Transfer Queue: " + LTQ.size());
		//Removes the front elements and prints it
		System.out.println("First element: " + LTQ.poll());
		
		System.out.println("Linked Tranfer Queue: " + LTQ);
		
		// Add numbers to end 
		LTQ.offer(20000);
		System.out.println("Linked Tranfer Queue: " + LTQ);
	}
}
