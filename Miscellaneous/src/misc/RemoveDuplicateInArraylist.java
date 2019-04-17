package misc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateInArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8, 9, 9));

		System.out.println("Array: " + arrList);

		ArrayList<Integer> linkedHashSet = new ArrayList<>(new LinkedHashSet<>(arrList));
		System.out.println("Array without duplicates: " + linkedHashSet);
	}
}
