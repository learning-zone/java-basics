package misc;
/**
 * Steps:- 
 * Bubble Sort algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 * 
 */
public class BubbleSort {

	public void bubbleSort(int[] arr) {
		boolean swap;
		int n = arr.length;
		int tmp = 0;
		for (int i = 0; i < n ; i++) {
			swap = false;
			for (int j = 1; j < n-i; j++) {
				if (arr[j-1] > arr[j]) {
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
					swap = true;
				}
			}
			if (!swap){
				break;
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
