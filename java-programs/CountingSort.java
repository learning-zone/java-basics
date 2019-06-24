package misc;
import java.util.Arrays;
/**
 * Counting sort is used to sort elements between specific range. 
 * Counting sort calculates the number of occurrence of objects and stores its key values. 
 * New array is formed by adding previous key elements and assigning to objects.
 * It can only sort an integer array or number array e.g. short, byte or char array.
 *
 */
public class CountingSort {
	
	public static void countingSort(int[] input, int k) {
		int counter[] = new int[k + 1];
		// fill bucket
		for(int i : input) {
			counter[i]++;
		}
		// sort array
		int ndx = 0;
		for(int i = 0; i < counter.length; i++) {
			while( 0 < counter[i]) {
				input[ndx++] = i;
				counter[i]--;
			}
		}
	}
	public static void main(String[] args) {
		int[] input = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };
		int k = 60;
		System.out.println("Integer array before sorting: " + Arrays.toString(input));
		countingSort(input, k);
		System.out.println("Integer array after sorting: " + Arrays.toString(input));
	}
}
