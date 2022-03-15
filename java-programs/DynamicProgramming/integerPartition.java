package DynamicProgramming;

import java.util.Arrays;

public class integerPartition {

	public static int pofN(int n) {
		// number of ways n can be represented as a sum of 1 - n - 1
		int[][] dp = new int[n][n + 1];
		dp[0][0] = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 1 || j == 1) {
					dp[i][j] = 1;
				} else if (j == 0) {
					dp[i][j] = 1;
				} else {
					if (i <= j) {
						dp[i][j] = dp[i - 1][j] + dp[i][j - i];
					} else {
						dp[i][j] = dp[i - 1][j];
					}
				}
			}
		}

		for (int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}

		return dp[n - 1][n];
	}

	public static long countStairs(int m) {
		long[][] dp = new long[3][m + 1];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= m; j++) {
				if (j == 0) {
					dp[i][j] = 1;
				} else if (i == 0) {
					dp[i][j] = 0;
				} else if (i == 1) {
					dp[i][j] = 1;
				} else {
					if (i > j) {
						dp[i][j] = dp[i - 1][j];
					} else {
						dp[i][j] = dp[i - 1][j] + dp[i][j - i];
					}
				}
			}
		}

		for (int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}

		return dp[2][m];
	}

	public static int reachAGivenScore(int n) {
		int[][] dp = new int[4][n + 1];
		int[] val = { 3, 5, 10 };

		for (int i = 0; i < 3; i++) {
			int x = val[i];
			for (int j = 0; j <= n; j++) {
				if(j == 0) {
					dp[i][j] = 1;
				}else if(i == 0) {
					dp[i][j] = 0;
				}else {
					if(x > j) {
						dp[i][j] = dp[i - 1][j];
					}else {
						System.out.println(x);
						dp[i][j] = dp[i - 1][j] + dp[i][j - x];
					}
				}
			}
		}
		
		for (int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		
		return dp[3][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(pofN(4));
//		System.out.println(countStairs(1));
		System.out.println(reachAGivenScore(8));
	}

}
