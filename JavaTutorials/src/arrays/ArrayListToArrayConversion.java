package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArrayConversion {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Integer[] arr = new Integer[al.size()];
		arr = al.toArray(arr);
		
		for(Integer x: arr) {
			System.out.print(x + " ");
		}
	}
}
