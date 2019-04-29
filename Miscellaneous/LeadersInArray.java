package misc;

/**
 * An element is leader if it is greater than all the elements to its right
 * side. And the rightmost element is always a leader.
 * 
 */
public class LeadersInArray {

	void printLeaders(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			int j;
			for (j = i + 1; j < size; j++) {
				if (arr[i] <= arr[j]) {
					break;
				}
			}
			if (j == size) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		LeadersInArray obj = new LeadersInArray();
		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		int size = arr.length;
		obj.printLeaders(arr, size);
	}
}
