package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			al.add(i);
		}
		
		System.out.print(al);
		
		ListIterator itr = al.listIterator();
		
		while(itr.hasNext()){
			int i = (Integer)itr.next();
			
			System.out.print(i + " ");
			
			if(i % 2 == 0) {
				i++;
				itr.set(i);
				itr.add(i);
			}
		}
		
		System.out.println();
		System.out.println(al);

	}

}
