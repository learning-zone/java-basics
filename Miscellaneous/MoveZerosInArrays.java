package misc;

public class MoveZerosInArrays {

	static void pushZero(int arr[]) {
		int max = arr.length;
		int temp = 0;
		for (int i = 0, j = 0; j < max; j++) {
			if (arr[j] != 0) {
				if (i < j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				i++;
			}
		}
		System.out.println("Array after pushing zeros to the back: ");
		for (int i = 0; i < max; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = { 0, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };

		pushZero(arr);
	}
}
