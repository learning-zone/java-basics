package misc;

public class UserDefinedExceptionMain {

	public static void main(String[] args) throws Exception {
		int price = -120;
		if(price < 0 ) {
			throw new UserDefinedException(price);
		} else {
			System.out.println("You have entered: "+price + "rs");
		}
	}
}
