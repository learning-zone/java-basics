package DynamicProgramming;

public class findPathExistence {

	public static boolean isPossible(int[][] grid, boolean[][] dp, int i, int j, int n) {
		if (grid[i][j] == 2)
			return true;

		if (i - 1 >= 0 && grid[i - 1][j] != 0 && !dp[i - 1][j]) {
			dp[i - 1][j] = true;
			if (isPossible(grid, dp, i - 1, j, n)) {
				return true;
			}
		}

		if (i + 1 < n && grid[i + 1][j] != 0 && !dp[i + 1][j]) {
			dp[i + 1][j] = true;
			if (isPossible(grid, dp, i + 1, j, n)) {
				return true;
			}
		}

		if (j + 1 < n && grid[i][j + 1] != 0 && !dp[i][j + 1]) {
			dp[i][j + 1] = true;
			if (isPossible(grid, dp, i, j + 1, n)) {
				return true;
			}
		}

		if (j - 1 >= 0 && grid[i][j - 1] != 0 && !dp[i][j - 1]) {
			dp[i][j - 1] = true;
			if (isPossible(grid, dp, i, j - 1, n)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 3, 0, 0 }, { 3, 0, 0, 0, 3 }, { 3, 3, 3, 3, 3 }, { 0, 2, 3, 0, 0 },
				{ 3, 0, 0, 1, 3 } };
		int n = grid.length;
		boolean flag = false;

		boolean[][] dp = new boolean[grid.length][grid.length];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					dp[i][j] = true;
					flag = isPossible(grid, dp, i, j, n);
				}
			}
		}

		System.out.println(flag);
	}

}
