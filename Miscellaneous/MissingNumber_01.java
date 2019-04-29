package misc;
/**
 * Logic:- 
 * 01. Find the sum of n number using formula n=n*(n+1)/2
 * 02. Subtract (sum of n numbers – sum of elements present in the array).
 * 
 */
public class MissingNumber_01 {

	public static int missingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int restSum = 0;
		for(int i = 0; i< arr.length; i++ ) {
			restSum += arr[i]; 
		}
		int missingNumber = sum - restSum;
		return missingNumber;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6, 7, 8};
		System.out.println("Missing Number: " +missingNumber(arr));
	}
}
