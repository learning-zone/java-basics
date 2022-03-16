package DynamicProgramming;

import java.util.*;

public class equalSumSubset {

	public static void generateAllSubsets(int[] arr, int index, ArrayList<Integer> list, int n) {

		if (index == n) {
			System.out.println(list);
			return;
		}

		list.add(arr[index]);
		generateAllSubsets(arr, index + 1, list, n);
		list.remove(list.size() - 1);
		generateAllSubsets(arr, index + 1, list, n);
	}

	public static void checkSum(int[] arr, int index, int n, int sum) {
		if (index == n) {
			System.out.println(sum);
			return;
		}

		checkSum(arr, index + 1, n, sum + arr[index]);
		checkSum(arr, index + 1, n, sum);
	}
	
	public static int dpApproach(int[] arr, int target, int n) {
		int[][] dp = new int[n + 1][target + 1];
		dp[0][0] = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j <= target; j++) {
				if(j == 0) {
					dp[i][j] = 1;
				}else {
					if(j >= arr[i - 1]) {
						dp[i][j] = (dp[i][j - arr[i - 1]] | dp[i - 1][j]);
					}else {
						dp[i][j] = dp[i - 1][j];
					}
				}
			}
		}
		
		return dp[n][target];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		generateAllSubsets(arr, 0, new ArrayList<Integer>(), arr.length);
		checkSum(arr, 0, arr.length, 0);
	}

}
