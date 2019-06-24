package misc;

public class LongestPalindromeSubstring {

		static void printSubString(String str, int low, int high) {
			System.out.println(str.substring(low, high + 1));
		}
		static int longestPalSubStr(String str) {
			int maxLength = 1;
			int start = 0;
			int len = str.length();
			int low, high;
			
			for(int i = 1; i < len; i++) {
				low  = i - 1;
				high = i;
				while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
					if(high - low + 1 > maxLength) {
						start = low;
						maxLength = high - low + 1;
					}
				--low;
				++high;
			}
			// Find the longest odd length Palindrome with center point as i
			low = i - 1;
			high = i + 1;
			while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				if(high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}
		}
			System.out.print("Longest Palindrome Substring is: ");
			printSubString(str, start, start + maxLength - 1);
			
			return maxLength;
		}
		
		public static void main(String args[]) {
			String str = "Hello World";
			System.out.println("String: " + str);
			System.out.println("Length is: "+longestPalSubStr(str));
		}
	}

