package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IterableToCollectionConversion {

	// function to convert Iterator into Collection
	public static <T>Collection<T> getCollectionFromIterable(Iterable <T> itr) {
		Collection<T> items = new ArrayList<T>();
		
		Iterator<T> iterator = itr.iterator();
		while(iterator.hasNext()) {
			items.add(iterator.next());
		}
		
		return items;
	}
	public static void main(String[] args) {
		Iterable<Integer> itr = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Iterable List: " + itr);
		
		Collection<Integer> cn = getCollectionFromIterable(itr);
		System.out.println("Collection List: " + cn);

	}

}
