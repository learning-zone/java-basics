package DynamicProgramming;

import java.util.Arrays;

public class numberOfCoins {

	public static int mincoins(int[] coins, int m, int v) {
		int[] dp = new int[v + 1];
		dp[0] = 0;

		for (int i = 1; i <= v; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < m; j++) {
				int value = i;
				int count = 1;
				if (coins[j] <= i) {
					while (value > 0) {
						if (value - coins[j] >= 0 && dp[value - coins[j]] != Integer.MAX_VALUE) {
							min = Math.min(min, count + dp[value - coins[j]]);
						}

						value = value - coins[j];
						count++;
					}
				}
			}

			dp[i] = min;
		}

		return (dp[v] == Integer.MAX_VALUE) ? -1 : dp[v];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 26;
		int m = 5;
		int coins[] = { 3, 7, 6, 11, 8 };

		System.out.println(mincoins(coins, m, v));
	}

}
