package collections;

import java.util.*;
public class AbstractListExample {

	public static void main(String[] args) {
		AbstractList<String> list = new LinkedList<String>();
		
		// Using add() method to add elements in the list
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		System.out.println("Abstract List: "+list);
		
		list.remove(2);	
		System.out.println("Final AbstractList: " + list);
	}
}
