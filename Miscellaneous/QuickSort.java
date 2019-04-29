package misc;
import java.util.Arrays;
import java.util.Stack;

public class QuickSort {
	/** 
	 * Iterative implementation of QuickSort sorting algorithm. 
	 * 
	 * */
	public static void iterativeQuickSort(int[] numbers) {
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		stack.push(numbers.length);
		
		while(!stack.isEmpty()) {
			int end =  (int) stack.pop();
			int start = (int) stack.pop();
			if(end - start < 2) {
				continue;
			}
			int p = start + ((end - start) / 2);
			p = partition(numbers, p, start, end);
			
			stack.push(p + 1);
			stack.push(end);
			stack.push(start);
			stack.push(p);
		}
	}
	/** 
	 *  Utility method to partition the array into smaller array, and 
	 *  comparing numbers to rearrange them as per QuickSort algorithm. 
	 **/
	private static int partition(int[] input, int position, int start, int end) {
		int l = start;
		int h = end - 2;
		int piv = input[position];
		swap(input, position, end - 1);
		
		while(l < h) {
			if(input[l] < piv) {
				l++;
			} else if(input[h] >= piv) {
				h--;
			} else {
				swap(input, l, h);
			}
		}
		int idx = h;
		if(input[h] < piv) {
			idx++;
		}
		swap(input, end - 1, idx);
		return idx;
	}
	/** 
	 * Utility method to swap two numbers  
	 **/
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] array = {34, 32, 43, 12, 11, 32, 22, 21, 32};
		System.out.println("Before Sorting: " + Arrays.toString(array));
		iterativeQuickSort(array);
		System.out.println("After Sorting: " + Arrays.toString(array));
	}
}
