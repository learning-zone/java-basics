package misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConvertCollectionToSynchronizedCollection {

	public static void main(String[] args) {
		List<String> syncList = Collections.synchronizedList(new ArrayList<String>());

		syncList.add("one");
		syncList.add("two");
		syncList.add("three");

		synchronized (syncList) {
			Iterator<String> iterator = syncList.iterator();
			while (iterator.hasNext()) {
				System.out.println("Item: " + iterator.next());
			}
		}
	}
}
