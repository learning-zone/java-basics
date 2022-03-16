package DynamicProgramming;

import java.util.Arrays;

public class maximumCut {

	public static int maximizeCut(int rodLength, int x, int y, int z) {

		if (rodLength == 0)
			return 0;

		if (rodLength < 0)
			return -1;

		int res;

		res = Math.max(maximizeCut(rodLength - x, x, y, z),
				Math.max(maximizeCut(rodLength - y, x, y, z), maximizeCut(rodLength - z, x, y, z)));

		if (res < 0)
			return -1;
		else
			return res + 1;
	}

	public static int dpApproach(int rodLength, int a, int b, int c) {
		int[] dp = new int[rodLength + 1];
		Arrays.fill(dp, -1);

		dp[0] = 0;

		for (int i = 1; i <= rodLength; i++) {
			if (a <= i && dp[i - a] != -1) {
				dp[i] = 1 + dp[i - a];
			}

			if (b <= i && dp[i - b] != -1) {
				dp[i] = Math.max(1 + dp[i - b], dp[i]);
			}

			if (c <= i && dp[i - c] != -1) {
				dp[i] = Math.max(1 + dp[i - c], dp[i]);
			}
		}
		
		if(dp[rodLength] == -1) return 0;
		return dp[rodLength];
	}
	
	public static int twApproach(int rodLength, int a, int b, int c) {
		int[] dp = new int[rodLength + 1];
		Arrays.fill(dp, -1);

		dp[0] = 0;

		for (int i = 1; i <= rodLength; i++) {
			int res = 0;
			if (a <= i && dp[i - a] != -1) {
				res += dp[i - a];
			}

			if (b <= i && dp[i - b] != -1) {
				res += dp[i - b];
			}

			if (c <= i && dp[i - c] != -1) {
				res += dp[i - c];
			}
			
			if(res != 0) dp[i] = res;
		}
		
		if(dp[rodLength] == -1) return 0;
		return dp[rodLength];
	}
	
	static long countWays(int n)
    {
        // add your code here
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000007;
        }

        return dp[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(maximizeCut(4, 2, 1, 1));
//		System.out.println(dpApproach(4, 2, 1, 1));
//		System.out.println(dpApproach(5, 5, 3, 2));
		System.out.println(dpApproach(20, 3, 5, 10));
		System.out.println(twApproach(20, 3, 5, 10));
		
//		System.out.println(countWays(3));
	}

}
