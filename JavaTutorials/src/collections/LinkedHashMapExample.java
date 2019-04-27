package collections;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Number, String> lhm = new LinkedHashMap<Number, String>();
		
		lhm.put(1, "One");
		lhm.put(2, "Two");
		lhm.put(3, "Three");
		lhm.put(4, "Four");
		lhm.put(5, "Five");
		
		System.out.println("LinedHashMap: " +lhm);
		System.out.println("Value of Key 1: " +lhm.get(1));
		System.out.println("Size of LinedHashMap: " +lhm.size());
		System.out.println("Is map empty: " +lhm.isEmpty());
		System.out.println("Contains key 5: " +lhm.containsKey(5));
		System.out.println("Delete element one: " +lhm.remove(1));
		System.out.println("Final LinedHashMap: " +lhm);
	}
}
