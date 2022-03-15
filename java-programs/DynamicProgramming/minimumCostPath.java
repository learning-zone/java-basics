package DynamicProgramming;

public class minimumCostPath {

//	public static int minimumPath(int[][] matrix, int i, int j, int up, int down, int left, int right) {
//
//		if (i == down - 1 && j == right - 1) {
//			return matrix[i][j];
//		}
//
//		int num1 = Integer.MAX_VALUE;
//		int num2 = Integer.MAX_VALUE;
//		int num3 = Integer.MAX_VALUE;
//		int num4 = Integer.MAX_VALUE;
//
//		if (j - 1 > left) {
//			num1 = minimumPath(matrix, i, j - 1, up, down, left, j - 1);
//		}
//
//		if (j + 1 < right) {
//			num2 = minimumPath(matrix, i, j + 1, up, down, j + 1, right);
//		}
//
//		if (i - 1 > up) {
//			num3 = minimumPath(matrix, i - 1, j, up, i - 1, left, right);
//		}
//
//		if (i + 1 < down) {
//			num4 = minimumPath(matrix, i + 1, j, i + 1, down, left, right);
//		}
//
//		return matrix[i][j] + Math.min(Math.min(num1, num2), Math.max(num3, num4));
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 9, 4, 9, 9 }, { 6, 7, 6, 4 }, { 8, 3, 3, 7 }, { 7, 4, 9, 10 } };
		int n = grid.length;
//		System.out.println(minimumPath(grid, 0, 0, 0, n, 0, n));
	}

}
