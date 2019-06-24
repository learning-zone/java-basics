package arrays;

import java.util.Random;
import java.util.Arrays;

public class ParallelSortUsingSeries {

	public static void main(String[] args) {
		int num[] = new int[100];
		
		for(int i = 0; i < 1000; i += 10 ) {
			System.out.println("\nFor Iteration number: " + (i / 10 + 1));
			
			Random rand = new Random();
			for(int j = 0; j < 100; j++) {
				num[j] = rand.nextInt();
			}
			// Start and End Time of Arrays.sort()
			long startTime = System.nanoTime();
			
			// Preforming Serial Sort
			Arrays.sort(num);
			
			long endTime = System.nanoTime();
			
			System.out.println("Start and End time in Serial: " + startTime + " : " + endTime);
			System.out.println("Time taken by Serial Sort:" + (endTime - startTime));
			
			// Start and End Time of Arrays.parallelSort()
			startTime = System.nanoTime();
			
			// Performing Parallel Sort
			Arrays.parallelSort(num);
			
			endTime = System.nanoTime();
			
			// Printing result of Paralle Sort
			System.out.println("Start and End Time in Parallel: "+ startTime + ":" + endTime);
			System.out.println("Time taken by Parallel Sort: " + (endTime - startTime));
			System.out.println();
			
		}

	}

}
