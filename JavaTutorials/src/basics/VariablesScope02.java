package basics;

public class VariablesScope02 {

	public static void main(String[] args) {
		{
			int x = 5; {
				int y = 10;
				System.out.println(x);
			}
		}
		

	}

}
