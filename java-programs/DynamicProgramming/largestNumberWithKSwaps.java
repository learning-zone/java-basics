package DynamicProgramming;

import java.util.Arrays;

public class largestNumberWithKSwaps {

	public static void Kswaps(char[] arr, int swaps) {
		if (swaps == 0) {
			System.out.println(Arrays.toString(arr));
			return;
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] > arr[i]) {
					swap(arr, i, j);
					Kswaps(arr, swaps - 1);
					swap(arr, i, j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = { '1', '2', '3', '4', '5', '6', '7' };
		Kswaps(arr, 4);
	}

	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
