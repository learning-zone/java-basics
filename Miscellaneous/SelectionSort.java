package misc;

public class SelectionSort {

	public static void doSelectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		System.out.println("\n\nArray after sort");
		for (int element : arr) {
			System.out.print(element + ", ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };

		System.out.println("Array before sort");
		for (int i : arr1) {
			System.out.print(i + ", ");
		}
		doSelectionSort(arr1);
	}
}
