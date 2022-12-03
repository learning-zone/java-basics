/*
  Binary search on an array after rotation
*/

package arrayDemo;

public class ArrayRotation {
	
	public static void show(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] rotate(int[] arr, int d) {
		int j = 0;
		int temp[] = new int[arr.length];
		
		for(int i = d; i < arr.length; i++) {
			temp[j] = arr[i];
			j++;
		}
		
		for(int i = 0; i < d; i++) {
			temp[j] = arr[i];
			j++;
		}
		
		
		return temp;
	}
	

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		show(arr);
		System.out.println();
		show(rotate(arr, 3));
		
	}

}
