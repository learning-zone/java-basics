package misc;
import java.util.Arrays;
/**
 * Bucket Sort is also known as bin sort. 
 * It works by distributing the element into the array also called buckets.
 * 
 */
public class BucketSort {

	public static int[] bucketSort(int[] arr) {
		int i, j;
		int[] bucket = new int[arr.length + 1];
		Arrays.fill(bucket, 0);
		
		for(i = 0; i < arr.length;  i++) {
			bucket[arr[i]]++;
		}
		int k = 0;
		for(i = 0; i <= arr.length; i++) {
			for(j = 0; j < bucket[i]; j++) {
				arr[k++] = i;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] num = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
		bucketSort(num);
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
