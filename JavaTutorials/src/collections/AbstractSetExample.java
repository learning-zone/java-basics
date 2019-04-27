package collections;

import java.util.*;

public class AbstractSetExample {

	public static void main(String[] args) throws Exception {
		try {
			AbstractSet<Integer> abs_set = new TreeSet<Integer>();
			
			abs_set.add(10);
			abs_set.add(20);
			abs_set.add(30);
			abs_set.add(40);
			abs_set.add(50);
			
			System.out.println("AbstractSet: " + abs_set);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
