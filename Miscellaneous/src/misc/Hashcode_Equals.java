package misc;
/**
 * Note:- 
 * 1. equals(Object obj): a method provided by java.lang.Object that
 *    indicates whether some other object passed as an argument is "equal to" the
 *    current instance. 
 * 2. hashcode(): a method provided by java.lang.Object that
 *    returns an integer representation of the object memory address.
 *
 */
public class Hashcode_Equals {

	private int id;
	private String name;

	public Hashcode_Equals(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Hashcode_Equals obj1 = new Hashcode_Equals(1, "Alex");
		Hashcode_Equals obj2 = new Hashcode_Equals(1, "Alex");
		System.out.println("Alex1 hasCode(): " + obj1.hashCode());
		System.out.println("Alex2 hasCode(): " + obj2.hashCode());
		System.out.println("Checking equality: " + obj1.equals(obj2));
	}
}
