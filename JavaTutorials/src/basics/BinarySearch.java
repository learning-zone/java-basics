package basics;
import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 15, 22, 35};
		Arrays.sort(arr);
		
		int key = 35;
		int res = Arrays.binarySearch(arr, key);
		if(res >= 0){
			System.out.println(key + " found at index = "+ res);
		} else {
			System.out.println(key + " not found");
		} 
	}
}
