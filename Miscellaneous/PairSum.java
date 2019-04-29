package misc;

public class PairSum {

	public static void PairWithMinSum(int arr[]) {
		if (arr.length < 2) {
			return;
		}
		int minimumSum = arr[0] + arr[1];
		int pair1stIndex = 0;
		int pair2ndIndex = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tempSum = arr[i] + arr[j];
				if (Math.abs(tempSum) < Math.abs(minimumSum)) {
					pair1stIndex = i;
					pair2ndIndex = j;
					minimumSum = tempSum;
				}
			}
		}
		System.out.println("The pair whose sum is closet to Zero: " + arr[pair1stIndex] + " & " + arr[pair2ndIndex]);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, -5, 7, 8, 20, -40, 6 };
		PairWithMinSum(arr);
	}
}
