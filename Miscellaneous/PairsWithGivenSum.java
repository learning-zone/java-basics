package misc;

public class PairsWithGivenSum {

	public static void getPairsSum(int[] arr, int sum) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println("Pairs: ( " + arr[i] + ", " + arr[j] + " ) = " + sum);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 6, 1, -2, 4, 7, 8, 9  };
		int sum = 10;
		getPairsSum(arr, sum);
	}
}
