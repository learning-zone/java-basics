package misc;

public class UserDefinedException extends Exception {

	private static final long serialVersionUID = 8331376309753029444L;
	private int price;
	
	public UserDefinedException(int price) {
		this.price = price;
	}
	public String toString() {
		return "Price should not be in Negative: " + price;
	}
}
