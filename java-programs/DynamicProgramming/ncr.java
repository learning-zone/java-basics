package DynamicProgramming;

import java.util.Arrays;

public class ncr {

	public static int NcR(int n, int r) {
		if (n == 1 || r == 0 || n == r) {
			return 1;
		}

		if (r == 1) {
			return n;
		}

		return NcR(n - 1, r) + NcR(n - 1, r - 1);
	}

	public static int dpApproach(int n, int r) {
		
		if(r > n) return -1;
		
		if(n == r) return 1;
		
		if(r == 0) return n;

		int[][] dp = new int[n + 1][r + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= r; j++) {
				if (i >= j) {
					if (j == 0) {
						dp[i][j] = i;
					} else if (i == j) {
						dp[i][j] = 1;
					} else if (j == 1) {
						dp[i][j] = i;
					} else {
						dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % 1000000007;
					}
				}
			}
		}

//		print(dp);
		return dp[n][r];
	}
	
	public static void print(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(NcR(84, 56));
		System.out.println(dpApproach(84, 56));
	}

}
