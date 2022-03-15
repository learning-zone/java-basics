package DynamicProgramming;

import java.util.Arrays;

public class eggDroppingPuzzle {

	public static int eggDrop(int e, int f) {
		if (f == 0 || f == 1) {
			return f;
		}

		if (e == 1) {
			return f;
		}

		int res = Integer.MAX_VALUE;
		for (int i = 1; i <= f; i++) {
			res = Math.min(res, Math.max(eggDrop(e - 1, i - 1), eggDrop(e, f - i)));
		}

		return res + 1;
	}
	
	public static int optimize(int egg, int floor) {
		int[][] dp = new int[egg + 1][floor + 1];
		
		for(int i = 0; i <= egg; i++) {
			for(int j = 0; j <= floor; j++) {
				if(i == 0 || j == 0) {
					dp[i][j] = 0;
				}else if(i == 1) {
					dp[i][j] = j;
				}else if(j == 1) {
					dp[i][j] = 1;
				}else {
					int res;
					int min = Integer.MAX_VALUE;
					for(int x = 1; x <= j; x++) {
						res = Math.max(dp[i - 1][x - 1], dp[i][j - x]);
						min = Math.min(min, res);
					}
					
					dp[i][j] = min + 1;
				}
			}
		}
		
		print(dp);
		return dp[egg][floor];
	}
	
	public static void print(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(optimize(3, 10));
	}

}
