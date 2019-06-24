package misc;
/**
 * Algorithm:- 
 * 1) Get the middle of the linked list.
 * 2) Reverse the second half of the linked list.
 * 3) Check if the first half and second half are identical.
 * 4) Construct the original linked list by reversing the second half again and attaching it back to the first half
 *
 */
public class LinkedListCheckPalindrome {
	
	class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public int size;
	public Node head = null;
	public Node tail = null;
	public void addNode(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}
	public Node reverseList(Node temp) {
		Node current = temp;
		Node prevNode = null;
		Node nextNode = null;
		while(current != null) {
			nextNode = current.next;
			current.next = prevNode;
			prevNode = current;
			current = nextNode;
		}
		return prevNode;	
	}
	public void isPalindrome() {
		Node current = head;
		boolean flag = true;
		int mid = (size % 2 == 0) ? (size/2) : ((size+1)/2);
		for(int i = 1; i < mid; i++) {
			current = current.next;
		}
		Node revHead = reverseList(current.next);
		while(head != null && revHead != null) {
			if(head.data != revHead.data) {
				flag = false;
				break;
			}
			head = head.next;
			revHead = revHead.next;
		}
		if(flag) {
			System.out.println("\nLinkedList is Palondrome !!!");
		} else {
			System.out.println("\nLinkedList is not Palindrome !");
		}
	}
	public void display() {
		Node current = head;
		System.out.print("Nodes of Singly linked list: ");
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println(" ");
	}
	public static void main(String[] args) {
		LinkedListCheckPalindrome linkedList = new LinkedListCheckPalindrome();
		linkedList.addNode(1);
		linkedList.addNode(2);
		linkedList.addNode(3);
		linkedList.addNode(2);
		linkedList.addNode(1);
		linkedList.display();
		linkedList.isPalindrome();
	}
}
