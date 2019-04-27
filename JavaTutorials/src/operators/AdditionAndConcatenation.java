package operators;

public class AdditionAndConcatenation {

	public static void main(String[] args) {

		System.out.println(2 + 0 + 1 + 8 + "Hello"); 
        System.out.println("Hello" + 2 + 0 + 1 + 8); 
        System.out.println(2 + 0 + 1 + 6 + "Hello" + 2 + 0 + 1 + 8); 
        System.out.println(2 + 0 + 1 + 6 + "Hello" + ( 2 + 0 + 1 + 8));
	}
}
