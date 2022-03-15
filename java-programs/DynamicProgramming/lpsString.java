package DynamicProgramming;

import java.util.Arrays;

public class lpsString {
	
	public static String longestPalindrome(String S){
        // code here
        int n = S.length();
        if(n == 0 || n == 1){
            return S;
        }
        
        int[][] dp = new int[n][n];
        String result = S.charAt(0)+"";
        for(int diagonal = 0; diagonal < n; diagonal++){
            for(int i = 0, j = diagonal; j < n; j++, i++){
                if(i == j){
                    dp[i][j] = 1;
                }else if(j - i == 1){
                    if(S.charAt(i) == S.charAt(j)){
                        dp[i][j] = 1;
                        result = S.substring(i, j + 1);
                    }
                }else{
                    if(S.charAt(i) == S.charAt(j) && dp[i + 1][j - 1] == 1){
                        dp[i][j] = 1;
                        if(j - i + 1 > result.length()){
                            result = S.substring(i, j + 1);
                        }
                    }
                }
            }
        }
        
        print(dp);
        
        return result;
    }
	
	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("aaaabbaa"));
	}

}
