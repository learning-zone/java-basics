package arrays;

import java.util.Collection;

public class Arrays {

	public static void main(String[] args) {
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;
		
		try {
			for(int i = 0; i <= arr.length; i++ ){
				System.out.println(arr[i]);
			}
			
		} catch (Exception e) {
			System.out.println("Exception: "+ e);
			e.printStackTrace();
		}
	}

}
