package DynamicProgramming;

import java.util.Arrays;

public class PrintingLCS {

	public static String commonLCS(String txt1, String txt2) {
		String result = "";
		int n = txt1.length();
		int m = txt2.length();

		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < m + 1; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				} else {
					if (txt1.charAt(i - 1) == txt2.charAt(j - 1)) {
						dp[i][j] = dp[i - 1][j - 1] + 1;
					} else {
						dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
					}
				}
			}
		}

		print(dp);

		if(dp[n][m] == 0) {
			return result;
		}
		
		int i = n;
		int j = m;
		
		while(i > 0 && j > 0) {
			if(dp[i][j] > dp[i - 1][j] && dp[i][j] > dp[i][j - 1]) {
				result = txt1.charAt(i - 1) + result;
				i--;
				j--;
			}else {
				if(dp[i][j] == dp[i][j - 1]) {
					j--;
				}else {
					i--;
				}
			}
		}

		return result;
	}

	public static void print(int[][] dp) {
		for (int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(commonLCS("MZJAWXU","XMJYAUZ"));
	}

}
