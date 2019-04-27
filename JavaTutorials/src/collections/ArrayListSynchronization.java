package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronization {

	public static void main(String[] args) {
		List<String> list =  Collections.synchronizedList(new ArrayList<String>());
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		synchronized(list) {
			Iterator itr = list.iterator();
			System.out.println("Synchronized List: ");
			while(itr.hasNext()) {
				System.out.print(itr.next() + ", ");
			}
		}
	}
}
