package misc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/**
 * Java Program to Sort a List using Collections.Sort methods 
 * This implementation uses merge sort.
 *
 */
public class CollectionSort {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("India");
		list.add("India");
		list.add("United States");
		list.add("Malaysia");
		list.add("Australia");
		list.add("Lundon");
		
		Collections.sort(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
