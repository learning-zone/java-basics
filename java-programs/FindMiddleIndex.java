package misc;

public class FindMiddleIndex {

	public static void findMiddleIndex(int[] numbers) {
		int endIndex = numbers.length - 1;
		int startIndex = 0, sumLeft = 0, sumRight = 0;
		while (true) {
			if (sumLeft > sumRight) {
				sumRight += numbers[endIndex--];
			} else {
				sumLeft += numbers[startIndex++];
			}
			if (startIndex > endIndex) {
				if (sumLeft == sumRight) {
					System.out.println("Left Sum: " + sumLeft + "\nRight Sum: " + sumRight);
					break;
				} else {
					System.out.println("Left sum are not equal to right sum");
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] num = { 2, 4, 4, 5, 4, 1 };
		findMiddleIndex(num);
	}
}
