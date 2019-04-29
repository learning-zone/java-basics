package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");
		linkedset.add("A"); //Duplicate element
		linkedset.add("E");
		
		System.out.println("LinkedHashSet: " + linkedset);
		System.out.println("LinkedHashSet size: " + linkedset.size());
		System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));
		System.out.println("Removing Z from LinkedHashSet: " + linkedset.remove("Z"));
		System.out.println("Checking if A is present in LinkedHashSet: " + linkedset.contains("A"));
		System.out.println("Final LinkedHashSet: " + linkedset);
	}
}
