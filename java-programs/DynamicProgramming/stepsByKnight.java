package DynamicProgramming;

import java.util.*;

public class stepsByKnight {

	public static int minSteps(Pair kp, Pair tp, int n, boolean[][] dp) {
		int count = 0;
		Queue<Pair> q = new LinkedList<>();
		if (equals(kp, tp))
			return count;
		q.add(kp);

		while (!q.isEmpty()) {
			int size = q.size();
			count++;
			for (int i = 0; i < size; i++) {
				Pair p = q.poll();
				int x = p.x;
				int y = p.y;

				Pair newp = new Pair(x + 1, y - 2);
				if (isValid(newp, n) && !dp[x + 1][y - 2]) {
					if (equals(newp, tp)) {
						return count;
					} else {
						q.add(newp);
						dp[x + 1][y - 2] = true;
					}
				}

				newp = new Pair(x + 1, y + 2);
				if (isValid(newp, n) && !dp[x + 1][y + 2]) {
					if (equals(newp, tp)) {
						return count;
					} else {
						q.add(newp);
						dp[x + 1][y + 2] = true;
					}
				}
				newp = new Pair(x - 1, y - 2);
				if (isValid(newp, n) && !dp[x - 1][y - 2]) {
					if (equals(newp, tp)) {
						return count;
					} else {
						q.add(newp);
						dp[x - 1][y - 2] = true;
					}
				}

				newp = new Pair(x - 1, y + 2);
				if (isValid(newp, n) && !dp[x - 1][y + 2]) {
					if (equals(newp, tp)) {
						return count;
					} else {
						q.add(newp);
						dp[x - 1][y + 2] = true;
					}
				}

				newp = new Pair(x - 2, y + 1);
				if (isValid(newp, n) && !dp[x - 2][y + 1]) {
					if (equals(newp, tp)) {
						return count;
					} else {
						q.add(newp);
						dp[x - 2][y + 1] = true;
					}
				}

				newp = new Pair(x - 2, y - 1);
				if (isValid(newp, n) && !dp[x - 2][y - 1]) {
					if (equals(newp, tp)) {
						return count;
					} else {
						q.add(newp);
						dp[x - 2][y - 1] = true;
					}
				}

				newp = new Pair(x + 2, y - 1);
				if (isValid(newp, n) && !dp[x + 2][y - 1]) {
					if (equals(newp, tp)) {
						return count;
					} else {
						q.add(newp);
						dp[x + 2][y - 1] = true;
					}
				}

				newp = new Pair(x + 2, y + 1);
				if (isValid(newp, n) && !dp[x + 2][y + 1]) {
					if (equals(newp, tp)) {
						return count;
					} else {
						q.add(newp);
						dp[x + 2][y + 1] = true;
					}
				}
			}
		}

		return -1;
	}

	public static boolean equals(Pair p1, Pair p2) {
		if (p1.x == p2.x && p1.y == p2.y)
			return true;

		return false;
	}

	public static boolean isValid(Pair p, int n) {
		if (p.x >= 0 && p.x < n && p.y >= 0 && p.y < n) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair kp = new Pair(3, 4);
		Pair tp = new Pair(0, 0);
		boolean[][] dp = new boolean[6][6];
		dp[3][4] = true;
		System.out.println(minSteps(kp, tp, 6, dp));
	}

}

class Pair {
	int x;
	int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
