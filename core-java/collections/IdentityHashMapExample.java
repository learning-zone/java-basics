package collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		Map hm = new HashMap();
		Map ihm = new IdentityHashMap();
		
		hm.put(1, "Sunday");
		hm.put(new String("Two"), "Monday");
		ihm.put(3, "Tuesday");
		ihm.put(new String("Four"), "Wednesday");
		
		System.out.println("HashMap: "+ hm);
		System.out.println("IdentityHashMap: "+ ihm);
		System.out.println("Size of HashMap: "+ hm.size());
		System.out.println("Size of IdentityHashMap: "+ ihm.size());
	}
}
