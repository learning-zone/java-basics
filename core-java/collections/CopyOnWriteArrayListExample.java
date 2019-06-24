package collections;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class CopyOnWriteArrayListExample extends Thread {
	
	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	
	public void run() {
		// Child thread trying to add new element
		// in the Collection object
		l.add("D");
	}

	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("C");
		
		// Create a child thread that modify ArrayList
		CopyOnWriteArrayListExample obj = new CopyOnWriteArrayListExample();
		
		obj.start();
		Thread.sleep(1000);
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.print(s + " ");
			Thread.sleep(1000);
		}
		
		System.out.println();
		System.out.println(l);
	}
}
