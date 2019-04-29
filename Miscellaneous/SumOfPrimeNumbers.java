package misc;

public class SumOfPrimeNumbers {

	private static boolean isPrimeNumber(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int number = 2, count = 0, sum = 0;
		while (count < 10) {
			if (isPrimeNumber(number)) {
				System.out.println("Prime Number: " + number);
				sum += number;
				count++;
			}
			number++;
		}
		System.out.println("Sum of 5 Prime Numbers: " + sum);
	}
}
