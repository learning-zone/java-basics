package misc;

public class MaxTwoNumbersInArrays {

	public void getMaxNumber(int[] arr) {
		int maxOne = 0;
		int maxTwo = 0;
		for (int n : arr) {
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo < n) {
				maxTwo = n;
			}
		}
		System.out.println("First Max Number: " + maxOne);
		System.out.println("Second Max Number: " + maxTwo);
	}

	public static void main(String[] args) {
		int arr[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		MaxTwoNumbersInArrays obj = new MaxTwoNumbersInArrays();
		obj.getMaxNumber(arr);
	}
}
