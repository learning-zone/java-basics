package misc;

public class SquarerootOfNumber {

	public static double sqrt(int number) {
		double t;
		double squareRoot = number / 2;
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
		return squareRoot;
	}

	public static void main(String[] args) {
		System.out.println("Square root of 2: " + sqrt(2));
	}
}
