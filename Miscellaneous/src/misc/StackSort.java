package misc;
import java.util.Stack;

public class StackSort {

	public static Stack<Integer> sortStack(Stack<Integer> input) {
		Stack<Integer> tmpStack = new Stack<Integer>();
		while (!input.isEmpty()) {
			int tmp = input.pop();
			System.out.println("Element taken out: " + tmp);
			while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
				input.push(tmpStack.pop());
			}
			tmpStack.push(tmp);
			System.out.println("Input: " + input);
			System.out.println("Temporary Stack: " + tmpStack);
		}
		return tmpStack;
	}

	public static void main(String[] args) {

		Stack<Integer> input = new Stack<Integer>();
		input.add(6);
		input.add(4);
		input.add(5);
		input.add(9);
		input.add(2);
		System.out.println("Input: " + input);
		System.out.println("\nFinal sorted Stack: " + sortStack(input));
	}
}
