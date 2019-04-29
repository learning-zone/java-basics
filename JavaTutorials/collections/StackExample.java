package collections;

import java.util.Stack;

public class StackExample {

	// Pushing element on the top of stack
	static void stack_push(Stack<Integer> stack) {
		System.out.println("Push: ");
		for(int i = 0; i < 5; i++){
			stack.push(i);
			System.out.print(i + ", ");
		}
	}
	// Popping element from the top of the stack
	static void stack_pop(Stack<Integer> stack) {
		System.out.println("\nPop: ");
		
		for(int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.print(y + ", ");
		}
	}
	
	// Displaying element on the top of the stack
	static void stack_peek(Stack<Integer> stack) {
		Integer element = (Integer) stack.peek();
		System.out.println("\nElement on stack top: " + element);
	}
	// Searching element in the stack
	static void stack_search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);
		
		if(pos == -1){
			System.out.println(element + " not found in stack " );
		} else {
			System.out.println(element + " found at position: " + pos);
		}
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 2);
		stack_search(stack, 6);
	}
}
