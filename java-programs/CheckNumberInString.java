package misc;

public class CheckNumberInString {

	public static void main(String[] args) {
		String str = "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.";
		Boolean flag = false;		
		for(int i = 0; i < str.length(); i++) {
			flag = Character.isDigit(str.charAt(i));
			if(flag) {
				System.out.println(str + "\n ==> contains number"); break;
			} 
		}
	}
}
