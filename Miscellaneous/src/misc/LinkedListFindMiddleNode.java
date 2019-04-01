package misc;
import misc.LinkedList.Node;

public class LinkedListFindMiddleNode {

	public static void main(String[] args) {
		LinkedList.Node head = new LinkedList.Node(21);
		LinkedList list = new LinkedList(head);
		list.add(new LinkedList.Node(3));
		list.add(new LinkedList.Node(37));
		list.add(new LinkedList.Node(14));
		list.add(new LinkedList.Node(89));
		list.printList();
		Node middle = list.findMiddleNode(head);
		list.findMiddleNode(head); 
		System.out.println("Middle Node: "+ middle.data());
	}
}

class LinkedList {
	static class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
		public int data() {
			return data;
		}
		public Node next() {
			return next;
		}
	}

	private Node head;
	public LinkedList(Node head) {
		this.head = head;
	}
	/** Java method to add an element to linked list */
	public void add(Node node) {
		Node current = head;
		while (current != null) {
			if (current.next == null) {
				current.next = node;
				break;
			}
			current = current.next;
		}
	}
	/** Java method to print a singly linked list */
	public void printList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data() + " ");
			node = node.next();
		}
		System.out.println(" ");
	}
	/** Java method to find middle node in linked list */
	public Node findMiddleNode(Node head) {
		
		Node slowPointer, fastPointer; 
		slowPointer = fastPointer = head; 
		while(fastPointer !=null) { 
			fastPointer = fastPointer.next; 
			if(fastPointer != null && fastPointer.next != null) { 
				slowPointer = slowPointer.next; 
				fastPointer = fastPointer.next; 
			} 
		} 
		return slowPointer; 
	}
}
