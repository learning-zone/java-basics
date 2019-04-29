package arrays;
import java.util.Arrays;

public class ArraysBinarySearch {

	public static void main(String[] args) {

		int arr[] = {5, 1, 100, 50, 75, 12, 89, 51, 11, 28, 99};
		int key = 99;

		System.out.println("Array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Arrays after sort: "+Arrays.toString(arr));
		System.out.println(key + " found at index: " + Arrays.binarySearch(arr, key));
		
	}
}
