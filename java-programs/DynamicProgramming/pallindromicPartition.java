package DynamicProgramming;

import java.util.*;

public class pallindromicPartition {

	public static int pp(String str) {
		// code here
		int n = str.length();
		int[][] dp = new int[n][n];

		for (int diagonal = 0; diagonal < n; diagonal++) {
			for (int i = 0, j = diagonal; j < n; i++, j++) {
				if (i == j) {
					dp[i][j] = 0;
				} else if (j - i == 1) {
					if (str.charAt(i) == str.charAt(j)) {
						dp[i][j] = 0;
					} else {
						dp[i][j] = 1;
					}
				} else {
					if (isPallindrome(str.substring(i, j + 1))) {
						dp[i][j] = 0;
					} else {
						dp[i][j] = Integer.MAX_VALUE;
						for (int k = i; k < j; k++) {
							dp[i][j] = Math.min(dp[i][j], 1 + dp[i][k] + dp[k + 1][j]);
//							System.out.println(dp[i][j]);
						}
					}
				}
			}
		}

		return dp[0][n - 1];
	}

	static boolean isPallindrome(String s) {
		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}

			start++;
			end--;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pp("geek"));
	}

}
