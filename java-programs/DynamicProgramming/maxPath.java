package DynamicProgramming;

import java.util.Arrays;

public class maxPath {

	public static int maxPathSum(int[][] matrix, int i, int j, int n, int[][] dp) {
		if (dp[i][j] == 0) {

			if (i == n - 1) {
				return matrix[i][j];
			}

			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			if (i + 1 < n) {
				num1 = maxPathSum(matrix, i + 1, j, n, dp);
			}

			if (i + 1 < n && j - 1 > -1) {
				num2 = maxPathSum(matrix, i + 1, j - 1, n, dp);
			}

			if (i + 1 < n && j + 1 < n) {
				num3 = maxPathSum(matrix, i + 1, j + 1, n, dp);
			}

			dp[i][j] = matrix[i][j] + Math.max(num1, Math.max(num2, num3));
		}
		
		return dp[i][j];
	}
	
	public static void print(int[][] dp) {
		for(int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { {2} };
		int[][] dp = new int[matrix.length][matrix.length];
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			ans = Math.max(ans, maxPathSum(matrix, 0, i, matrix.length, dp));
		}

		print(dp);
	}

}
