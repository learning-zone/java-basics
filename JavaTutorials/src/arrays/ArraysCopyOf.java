package arrays;

import java.util.Arrays;

public class ArraysCopyOf {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3};
		
		System.out.println("Arrays: "+ Arrays.toString(arr));
		
		int[] copy = Arrays.copyOf(arr, 5);
		copy[3] = 10;
		copy[4] = 20;	
		System.out.println("Copied Arrays: " + Arrays.toString(copy));	
	}
}
