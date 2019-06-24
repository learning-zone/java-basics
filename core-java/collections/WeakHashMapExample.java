package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) {
		Map<Number, String> weak = new WeakHashMap<Number, String>();
		weak.put(1, "A");
		weak.put(2, "B");
		weak.put(3, "C");
		
		Set set1 = weak.entrySet();
		System.out.println("Set: "+set1);
		
		// Creating set for key
		Set keySet = weak.keySet();
		System.out.println("Key Set: " + keySet);
		
		Collection value  = weak.values();
		System.out.println("Map Values: " + value);
	}
}
