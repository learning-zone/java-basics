package misc;

public class MaximalSubarray {
	
	private static int[] arr = {1, -2, 3, 4, -9, 6};
	private int getMaxSubSum(int[] arr) {
		int maxSum = 0;
		int partialSum = 0;
		for(int i = 0; i < arr.length; i++) {
			partialSum += arr[i];
			maxSum = Math.max(maxSum, partialSum);
			if(partialSum < 0) {
				partialSum = 0; // Zero if negative
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		MaximalSubarray obj = new MaximalSubarray();
		int sum = obj.getMaxSubSum(arr);
		System.out.println("Sum: "+sum); // 3 + 4 = 7
	}
}
