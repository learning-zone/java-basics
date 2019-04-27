package exceptionhandling;

public class ChainedExceptions {

	public static void main(String[] args) {

		try {
			// Creating an expension
			NumberFormatException ex = new NumberFormatException("Exception");
			
			// Setting a cause of the exception
			ex.initCause(new NullPointerException("This is actual cause of the exception"));
			
			// Throwing an exception with cause
			throw ex;
		} catch (NumberFormatException ex) {
			System.out.println("Exception: "+ex);
			
			// Getting the actual cause of the exception
			System.out.println(ex.getCause());
		}
	}
}
