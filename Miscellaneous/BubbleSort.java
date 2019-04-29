package misc;
/**
 * Steps:- 
 * Bubble Sort algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 * 
 */
public class BubbleSort {

	public void bubbleSort(int[] arr) {
		int n = arr.length;
		int tmp = 0;
		for (int i = 0; i < n ; i++) {
			for (int j = 1; j < n-1; j++) {
				if (arr[j-1] > arr[j]) {
					tmp = arr[j - 1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

		obj.bubbleSort(arr);
		System.out.println("Sorted Array");
		obj.printArray(arr);
	}
}
