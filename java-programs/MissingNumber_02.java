package misc;
/**
 * Logic:-
 *  loop through the given array and tick marking all the numbers 
 *  which are present by storing one of their respective indices.
 * 
 */
public class MissingNumber_02 {

	public static void main(String[] args) {
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		int[] register = new int[input.length];
		
		for (int i : input) {
			register[i] = 1;
		}
		System.out.println("Missing number: ");
		for (int i = 1; i < register.length; i++) {
			if (register[i] == 0) {
				System.out.println(i);
			}
		}
	}
}
