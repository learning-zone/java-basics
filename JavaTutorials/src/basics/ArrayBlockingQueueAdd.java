package basics;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueAdd {

	public static void main(String[] args) {
		// define capacity of ArrayBlockingQueue
		int capacity = 3;

		try {
			// Create object of ArrayBlockingQueue
			ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(capacity);

			// Add element to ArrayBlockingQueue
			queue.add(766);
			queue.add(432);
			queue.add(456);
			System.out.println("Added elements are: " + queue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
