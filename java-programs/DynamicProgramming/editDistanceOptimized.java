package DynamicProgramming;

public class editDistanceOptimized {

	public static int eD(String s1, String s2, int n, int m) {

		int[][] dp = new int[n + 1][m + 1];

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < m + 1; j++) {
				if (i == 0) {
					dp[i][j] = j;
				} else if (j == 0) {
					dp[i][j] = i;
				} else {
					if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
						dp[i][j] = dp[i - 1][j - 1];
					} else {
						dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
					}
				}
			}
		}

		return dp[n][m];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(eD("SATURDAY", "SUNDAY", 8, 6));
	}

}
