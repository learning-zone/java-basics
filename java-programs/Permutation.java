package misc;
/**
 * Algorithm:-
 * 1. Try each of the letters in turn as the first letter and 
 *    then find all the permutations of the remaining letters using a recursive call.
 * 2. The base case is when the input is an empty string the only permutation is the empty string.
 * 
 */
public class Permutation {

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}

	public static void main(String[] args) {

		String str = "ABC";
		Permutation obj = new Permutation();
		obj.permutation(str);
	}
}
