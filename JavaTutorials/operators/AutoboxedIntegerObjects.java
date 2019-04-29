package operators;

public class AutoboxedIntegerObjects {

	public static void main(String[] args) {
		Integer x = new Integer(10), y = new Integer(10);
		if(x == y) {
			System.out.println("Values are same");
		} else {
			System.out.println("Values are not same");
		}
	}
}
