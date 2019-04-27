package collections;

import java.util.concurrent.*;

public class ConcurrentLinkedDequeExample {

	public static void main(String[] args) {
		
		ConcurrentLinkedDeque<Integer> cld = new ConcurrentLinkedDeque<Integer>();
		
		cld.addFirst(100);
		cld.add(200);
		cld.addLast(300);
		
		System.out.println("ConcurrentLinedDeque: " + cld);
		System.out.println("The last element is: " + cld.getLast());
		System.out.println("The first element is: " + cld.getFirst());
		cld.removeLast();	
		System.out.println("ConcurrentLinedDeque: " + cld);
	}
}
