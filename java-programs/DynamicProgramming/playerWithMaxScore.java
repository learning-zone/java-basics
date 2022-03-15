package DynamicProgramming;

import java.util.Arrays;

public class playerWithMaxScore {

	public static int recursionMethod(int[] arr, int start, int end, boolean turn) {

		if (start == end) {
			return arr[start];
		} else if (end - start == 1) {
			if (turn) {
				return Math.max(arr[start], arr[end]);
			} else {
				return Math.min(arr[start], arr[end]);
			}
		}

		if (turn) {
			return Math.max(arr[start] + recursionMethod(arr, start + 1, end, false),
					arr[end] + recursionMethod(arr, start, end - 1, false));
		} else {
			return Math.min(recursionMethod(arr, start + 1, end, true), recursionMethod(arr, start, end - 1, true));
		}
	}

	public static int dp(int[] arr, int len) {
		int[][] dp = new int[len][len];
		for (int diagonal = 0; diagonal < len; diagonal = diagonal + 2) {
			for (int i = 0, j = diagonal; j < len; i++, j++) {
				if (i == j) {
					dp[i][j] = arr[i];
				} else {
					dp[i][j] = Math.max(arr[i] + Math.min(dp[i + 1][j - 1], dp[i + 2][j]),
							arr[j] + Math.min(dp[i + 1][j - 1], dp[i][j - 2]));
				}
			}
		}

		if(len % 2 == 0) {
			return dp[0][len - 2];
		}else {
			return dp[0][len - 1];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 20, 5, 4, 6, 8, 3 };
		System.out.println(recursionMethod(arr, 0, arr.length - 1, true));
		dp(arr, arr.length);
	}

}
