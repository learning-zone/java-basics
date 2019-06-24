package arrays;
import java.util.Arrays;

public class ArraysBinarySearch2 {

	public static void main(String[] args) {
		int arr[] = {29, 3, 50, 9, 12, 73, 5, 89, 5, 34, 8, 97};
		int key = 12;
		
		Arrays.sort(arr);
		System.out.println("Arrays after sort: "+Arrays.toString(arr));
		
		System.out.println(key + " found at index: "+ Arrays.binarySearch(arr, 0, 10, key));

	}

}
