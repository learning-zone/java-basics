package arrays;
import java.util.Arrays;

public class ArraysComparision {

	public static void main(String[] args) {
		int arr1[] = {1, 2, 3};
		int arr2[] = {1, 2, 3};
		if(Arrays.equals(arr1, arr2)){
			System.out.println("Both are Equal Arrays");
		} else {
			System.out.println("Not Equals");
		}
	}
}
