package DynamicProgramming;

import java.util.Arrays;

public class maxSumByRemovingOneEle {

	public static int maxSum(int[] arr) {
		int n = arr.length;
		int[] arrl = new int[n];
		int[] arrr = new int[n];
		arrl[0] = arr[0];
		arrr[n - 1] = arr[n - 1];
		int suml = arr[0];
		int maxS = arr[0];
		int sumr = arr[n - 1];

		for (int i = 1; i < n; i++) {
			suml = Math.max(suml + arr[i], arr[i]);
			sumr = Math.max(sumr + arr[n - 1 - i], arr[n - 1 - i]);
			maxS = Math.max(maxS, suml);
			arrl[i] = suml;
			arrr[n - 1 - i] = sumr;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrl));
		System.out.println(Arrays.toString(arrr));
		
		int ans = maxS;

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				ans = Math.max(ans, arrr[1]);
			} else if (i == n - 1) {
				ans = Math.max(ans, arrl[n - 2]);
			} else {
				ans = Math.max(ans, arrl[i - 1] + arrr[i + 1]);
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, -1, -1, 4, 5 };
		System.out.println(maxSum(arr));
	}

}
