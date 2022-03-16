package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {

	public static int coinChange(int[] coins, int amount) {
		int n = coins.length;
		int[][] dp = new int[n + 1][amount + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= amount; j++) {
				if (j == 0) {
					dp[i][j] = 0;
				} else if (i == 0) {
					dp[i][j] = -1;
				} else {
					if (coins[i - 1] > j) {
						dp[i][j] = dp[i - 1][j];
					} else {
						int price = j;
						int max = Integer.MIN_VALUE;
						int count = 0;
						while (price > 0) {
							count++;
							if (price >= coins[i - 1] && dp[i][price - coins[i - 1]] != -1) {
								max = Math.max(max, count + dp[i][price - coins[i - 1]]);
							}

							price -= coins[i - 1];
						}

						if (max == Integer.MIN_VALUE) {
							if (price == 0) {
								if (dp[i - 1][j] == -1)
									dp[i][j] = count;
								else
									dp[i][j] = Math.min(dp[i - 1][j], count);
							} else {
								dp[i][j] = dp[i - 1][j];
							}
						} else {
							if (price == 0) {
								if (dp[i - 1][j] == -1)
									dp[i][j] = Math.min(max, count);
								else
									dp[i][j] = Math.min(dp[i - 1][j], Math.min(max, count));
							} else {
								if (dp[i - 1][j] == -1)
									dp[i][j] = max;
								else
									dp[i][j] = Math.min(dp[i - 1][j], max);
							}
						}
					}
				}
			}
		}

//		print(dp);
		return dp[n][amount];
	}

	public static void print(int[][] dp) {
		for (int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[186,419,83,408]
//				6249
		int[] coins = {186,419,83,408};
		System.out.println(coinChange(coins, 6249));
	}

}
