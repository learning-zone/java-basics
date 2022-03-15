package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weight = { 7, 3, 4, 5 };
		int[] profit = { 42, 12, 40, 25 };
		int W = 10;

		System.out.println(solve(weight, profit, W, 0));
		System.out.println(dp(weight, profit, W));
	}

	public static int dp(int[] weight, int[] profit, int capacity) {
		int n = weight.length;
		int[][] dp = new int[n + 1][capacity + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= capacity; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				} else if (weight[i - 1] <= j) {
					dp[i][j] = Math.max(dp[i - 1][j], profit[i - 1] + dp[i - 1][j - weight[i - 1]]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		for (int i = 0; i <= n; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}

		System.out.println(actual_knapsack_item(dp, capacity, n, weight));

		return dp[n][capacity];
	}

	public static ArrayList<Integer> actual_knapsack_item(int[][] dp, int capacity, int n, int[] weight) {
		ArrayList<Integer> items = new ArrayList<>();
		for (int i = n; i > 0 && capacity > 0; i--) {
			if (dp[i][capacity] > dp[i - 1][capacity]) {
				items.add(i);
				capacity = capacity - weight[i - 1];
			}
		}

		return items;
	}

	public static int solve(int[] weight, int[] profit, int capacity, int index) {
		if (index == weight.length) {
			return 0;
		}

		if (weight[index] <= capacity) {
			return Math.max(profit[index] + solve(weight, profit, capacity - weight[index], index + 1),
					solve(weight, profit, capacity, index + 1));
		} else {
			return solve(weight, profit, capacity, index + 1);
		}

	}

}
