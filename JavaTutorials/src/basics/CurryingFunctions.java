package basics;
import java.util.function.Function;

public class CurryingFunctions {

	public static void main(String[] args) {
		/**
		 * Using Java 8 Functions
		 * to create lambda expressions for functions
		 * and with this, applying function Currying
		 */
		
		// Curried Function for Adding u & v
		Function<Integer, Function<Integer, Integer>>
		curryAdder = u -> v -> u + v;
		
		// Calling the curried functions
		System.out.println("Addition of 2 & 3 is: " + curryAdder
														.apply(2)
														.apply(3));

	}
}
