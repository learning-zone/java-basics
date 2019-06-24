package arrays;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayVsArrayList {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		// We can't add more elements to array arr[]
		
		/**....... ArrayList.........*/
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		// We can add more elements to arrList
		
		System.out.println(arrList);
		System.out.println(Arrays.toString(arr));
		
	}

}
