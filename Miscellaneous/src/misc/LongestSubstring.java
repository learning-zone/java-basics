package misc;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	String getUniqueCharacterSubstringBruteForce(String input) {
		String output = "";
		for (int start = 0; start < input.length(); start++) {
			Set<Character> visited = new HashSet<>();
			int end = start;
			for (; end < input.length(); end++) {
				char currChar = input.charAt(end);
				if (visited.contains(currChar)) {
					break;
				} else {
					visited.add(currChar);
				}
			}
			if (output.length() < end - start + 1) {
				output = input.substring(start, end);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "ABDEFGABEF";
		LongestSubstring obj = new LongestSubstring();
		System.out.println("Longest Substring: " + obj.getUniqueCharacterSubstringBruteForce(input));
	}
}
