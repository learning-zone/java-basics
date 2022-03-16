package DynamicProgramming;

import java.util.Arrays;

public class longestPallindromicSubsequence {

	public static int longestPalinSubseq(String S) {
		// code here
		int n = S.length();
		int[][] dp = new int[n][n];

		
		for (int gap = 0; gap < n; gap++) {
			for (int i = 0, j = gap; j < n; i++, j++) {
				if (i == j) {
					dp[i][j] = 1;
				} else if (j - i == 1) {
					if (S.charAt(i) == S.charAt(j)) {
						dp[i][j] = 2;
					} else {
						dp[i][j] = 1;
					}
				} else {
					if (S.charAt(i) == S.charAt(j)) {
						dp[i][j] = 2 + dp[i + 1][j - 1];
					} else {
						dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
					}
				}
			}
		}

		print(dp);

		return dp[0][n - 1];
	}

	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalinSubseq("geekssgeek"));
	}

}
