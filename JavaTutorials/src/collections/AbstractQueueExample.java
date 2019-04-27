package collections;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueExample {

	public static void main(String[] args) throws Exception {
		AbstractQueue<Integer> AQ = new LinkedBlockingQueue<Integer>();
		
		AQ.add(10);
		AQ.add(20);
		AQ.add(30);
		
		System.out.println("AbstractQueue contains: " + AQ);
		System.out.println("Head: "+ AQ.element());
		AQ.clear();
		System.out.println("AbstractQueue: " + AQ);
	}
}
