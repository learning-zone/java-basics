package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		
		sm.put(new Integer(2), "A");
		sm.put(new Integer(3), "B");
		sm.put(new Integer(5), "C");
		sm.put(new Integer(4), "D");
		sm.put(new Integer(1), "E");
		
		Set s = sm.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> m = (Map.Entry<Integer, String>)itr.next();
			
			int key = (Integer)m.getKey();
			String value = (String)m.getValue();
			
			System.out.println("Key: " + key + " Value: " + value);
		}
	}
}
