package collections;

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeExample {

	public static void main(String[] args) throws InterruptedException {
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();
		
		LBD.add(11111);
		LBD.add(22222);
		LBD.add(33333);
		LBD.add(44444);
		LBD.add(55555);
		
		System.out.println("LinkedBlockingDeque: " + LBD);
		System.out.println("Size of Linked Blocking Deque: " + LBD.size());
		System.out.println("First Element: " + LBD.removeFirst());
		System.out.println("LinkedBlockingDeque: " + LBD);
		LBD.offer(66666);
		System.out.println("LinkedBlockingDeque: " + LBD);
	}
}
