package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		System.out.println("Converting ArrayList to Array: ");
		String[] item = list.toArray(new String[list.size()]);
		for (String s : item) {
			System.out.println(s);
		}
		System.out.println("Converting Array to ArrayList: ");
		List<String> list2 = new ArrayList<>();
		list2 = Arrays.asList(item);
		System.out.println(list2);
	}
}
