package DynamicProgramming;

import java.util.*;

public class n_stairs {

	public static int totalWays(int n) {
		int[][] dp = new int[3][n + 1];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= n; j++) {
				if (j == 0 || i == 1) {
					dp[i][j] = 1;
				} else if (i == 0) {
					dp[i][j] = 0;
				} else if (j < i) {
					dp[i][j] = dp[i][j - 1];
				} else {
					dp[i][j] = dp[i][j - 1] + dp[i][j - i];
				}
			}
		}
		
		print(dp);
		return dp[2][n];
	}

	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		totalWays(4);
	}

}
