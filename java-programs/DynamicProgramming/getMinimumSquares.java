package DynamicProgramming;

public class getMinimumSquares {

//	public static int getMinSqr(int n) {
//		if (n == 0)
//			return 0;
//
//		int res = Integer.MAX_VALUE;
//
//		for (int i = 1; i * i <= n; i++) {
//			res = Math.min(res, getMinSqr(n - i * i));
//		}
//
//		return res + 1;
//	}

	public static int dpGetMinSqr(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1; // 1 * 1
		dp[2] = 2; // 1 * 1 + 1 * 1
		dp[3] = 3; // 1 * 1 + 1 * 1 + 1 * 1

		for (int i = 4; i <= n; i++) {
			dp[i] = i;
			for (int j = 1; j * j <= i; j++) {
				dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
			}
		}

		return dp[n];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dpGetMinSqr(1365));
	}

}
