package DynamicProgramming;

import java.util.Stack;

public class longestValidParanthesis {

	public static int validParanthesis(String S) {

		Stack<Character> stc = new Stack<>();
		Stack<Integer> st = new Stack<>();
		st.push(-1);
		int max = 0;
		
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == '(') {
				stc.push('(');
				st.push(i);
			}else {
				if(!stc.isEmpty()) {
					stc.pop();
					st.pop();
					max = Math.max(max, i - st.peek());
				}else {
					st.push(i);
				}
			}
			
			System.out.println(stc);
			System.out.println(st);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validParanthesis("))()(()"));
	}

}
