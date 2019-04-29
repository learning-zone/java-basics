package collections;

import java.util.HashMap;

class Key {
	String key;
	Key(String key) {
		this.key = key;
	}
	
	@Override
	public int hashCode() {
		int hash = (int)key.charAt(0);
		System.out.println("HashCode for Key: " + key + " = " + hash);
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		return key.equals(((Key)obj).key);
	}
}

public class HashMapExample {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new Key("One"), 10);
		map.put(new Key("Two"), 20);
		map.put(new Key("Three"), 30);
		
		System.out.println("Value for key One: " + map.get(new Key("One")));
		System.out.println("Value for key Two: " + map.get(new Key("Two")));
		System.out.println("Value for key Three: " + map.get(new Key("Three")));

	}

}
