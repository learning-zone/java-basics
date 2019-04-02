package misc;

class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}
public class LinkedListFindNodeFromEnd {

	Node head; 	
	// Function to get the nth node from the last of a linedList
	public int getNodeFromLinkedList(int index) {
		Node current = head;
		int count = 1;
		while(current != null) {
			if(count == index) {
				return current.data; 
			}
			count++;
			current = current.next;
		}
		assert(false);
		return 0;
	}
	/* Inserts a new Node at front of the list. */
	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	public static void main(String[] args) {
		LinkedListFindNodeFromEnd linkedList = new LinkedListFindNodeFromEnd();
		linkedList.push(10);
		linkedList.push(20);
		linkedList.push(30);
		linkedList.push(40);
		linkedList.push(50);
		System.out.println("Element at index 2:  "+linkedList.getNodeFromLinkedList(2));
	}
}
