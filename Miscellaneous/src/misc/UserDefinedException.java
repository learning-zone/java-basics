package misc;

public class UserDefinedException {

	public static void main(String[] args) throws Exception {
		int price = -120;
		if(price < 0 ) {
			throw new PriceException(price);
		} else {
			System.out.println("You have entered: "+price + "rs");
		}
	}
}
