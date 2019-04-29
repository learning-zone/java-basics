package collections;

import java.util.*;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Deque<Integer> de_que = new ArrayDeque<Integer>(10);
		
		de_que.add(10);
		de_que.add(20);
		de_que.add(30);
		
		System.out.println("Elements: " + de_que);
		
		de_que.clear();
		de_que.addFirst(100);
		de_que.addFirst(200);
		de_que.addLast(400);
		de_que.addLast(500);
		
		System.out.print("Using Iterator: ");
		for(Iterator itr = de_que.iterator(); itr.hasNext();){
			System.out.print(itr.next() + ", ");
		}
		System.out.print("\nUsing Decending Iterator: ");
		for(Iterator ditr = de_que.descendingIterator(); ditr.hasNext();){
			System.out.print(ditr.next() + ", ");
		}
		
		System.out.println("\nHead Element using element(): " + de_que.element());
		System.out.println("Head Element using getFirst(): " + de_que.getFirst());
		System.out.println("Last Element using getLast(): " + de_que.getLast());
		System.out.println("Array Size: " + de_que.size());
		System.out.println("Head Element using peek(): " + de_que.peek());
		System.out.println("Head Element using poll(): " + de_que.poll());
		System.out.println("Head Element remove: " + de_que.remove());
		System.out.println("Final Arrays: " + de_que);
	}
}
