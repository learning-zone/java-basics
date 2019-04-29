package misc;
/**
 * Steps:- Insertion sort algorithm builds the final sorted array one item at a
 * time.
 * Best Case:- n
 * Average Case:- n^{2}
 * Worst Case:- n^{2}
 *
 */
public class InsertionSort {

	public static int[] doInerstionSort(int[] input) {
		int tmp = 0;
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					tmp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = tmp;
				}
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 34, 2, 56, 42 };
		int[] result = doInerstionSort(arr);
		for (int i : result) {
			System.out.print(i + ", ");
		}
	}
}
