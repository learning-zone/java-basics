package DynamicProgramming;

public class optimalGameStartegy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2,6,3 };
		System.out.println(getMax(arr, 0, arr.length - 1));

//		int[] arr2 = { 2, 3, 15, 7 };
//		System.out.println(getMax(arr2, 0, arr2.length));
	}

	public static int getMax(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if (j - i == 1) {
			return Math.max(arr[i], arr[j]);
		}

		if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
			return Math.min(getMax(arr, i + 1, j), getMax(arr, i, j - 1));
		} else {
			return Math.max(arr[i] + getMax(arr, i + 1, j), arr[j] + getMax(arr, i, j - 1));
		}
	}

}
