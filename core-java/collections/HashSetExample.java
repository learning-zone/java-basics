package collections;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("AAA");
		hs.add("BBB");
		hs.add("CCC");
		hs.add("AAA");
		hs.add("DDD");
		
		System.out.println("HashSet: " + hs);
		System.out.println("List contains AAA? : " + hs.contains("AAA"));
		hs.remove("AAA");
		System.out.print("Iterating over list: ");
		Iterator<String> itr = hs.iterator();

		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
	}

}
