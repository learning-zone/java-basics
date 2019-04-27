package arrays;

import java.util.Arrays;

public class ParallelSort {

	public static void main(String[] args) {
		int num[] = { 0, 9, 3, 8, 6, 1, 7, 5 };
		
		System.out.print("Unsorted Arrays: ");
		Arrays.stream(num).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		Arrays.parallelSort(num);
		System.out.print("Sorted Array: ");
		Arrays.stream(num).forEach(n -> System.out.print(n + " "));
	}
}
