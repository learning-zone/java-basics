package misc;

/**
 * Algorithm: 
 * 1. Create two linked list which will represent two numbers. 
 * 2. Reverse both linked list. 
 * 3. Add two node values (Each node is being represented as single digit) starting from heads of two linkedlist. 
 * 4. If sum is of above two node values is more than 10, then forward the carry.
 * 
 */
public class AddTwoNumbersRepresentedByLinkedList {

	private static Node head;

	private static class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public void addToTheLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}

	public void printList(Node printNode) {
		Node temp = printNode;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public static Node reverseLinkedList(Node node) {
		if (node == null || node.next == null) {
			return node;
		}
		Node remaining = reverseLinkedList(node.next);
		node.next.next = node;
		node.next = null;
		return remaining;
	}

	// This function will do sum of numbers represented by linked list
	public Node findSumOfNumbers(Node l1, Node l2) {
		int carry = 0;
		Node newHead = null;
		Node tempNodeForIteration = null;
		int sum = 0;
		int firstIter = 0;
		while (l1 != null || l2 != null) {
			firstIter++;
			sum = carry;
			if (l1 != null) {
				sum = sum + l1.value;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum = sum + l2.value;
				l2 = l2.next;
			}
			carry = sum / 10;
			sum = sum % 10;
			// Check if it first node for the result
			if (firstIter == 1) {
				tempNodeForIteration = new Node(sum);
				newHead = tempNodeForIteration;
			} else {
				Node tempSumNode = new Node(sum);
				tempNodeForIteration.next = tempSumNode;
				tempNodeForIteration = tempNodeForIteration.next;
			}
		}
		if (carry != 0) {
			Node tempNode = new Node(carry);
			tempNodeForIteration.next = tempNode;
		}
		return newHead;
	}

	public static void main(String[] args) {
		AddTwoNumbersRepresentedByLinkedList list = new AddTwoNumbersRepresentedByLinkedList();

		Node head1 = new Node(5);
		list.addToTheLast(head1);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
		System.out.print("Number 1:  ");
		list.printList(head1);
		head = null;
		Node head2 = new Node(6);
		list.addToTheLast(head2);
		list.addToTheLast(new Node(3));
		list.addToTheLast(new Node(5));
		list.addToTheLast(new Node(9));
		System.out.print("Number 2:  ");
		list.printList(head2);
		head1 = reverseLinkedList(head1);
		head2 = reverseLinkedList(head2);

		// function to find sum of two linkedlist represent by number
		Node result = list.findSumOfNumbers(head1, head2);
		result = reverseLinkedList(result);
		System.out.print("Sum:  ");
		list.printList(result);
	}
}
