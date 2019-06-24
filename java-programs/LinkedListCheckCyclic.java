package misc;
import java.util.HashSet;
/**
 * Algorithm:-
 * 1) Use two pointers fast and slow
 * 2) Move fast two nodes and slow one node in each iteration
 * 3) If fast and slow meet then linked list contains cycle
 * 4) If fast points to null or fast.next points to null then linked list is not cyclic
 *
 */
public class LinkedListCheckCyclic {

	static Node head;  // head of list 
    
    /* Linked list Node*/
    static class Node { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
    
    /* Inserts a new Node at front of the list. */
    static public void push(int new_data) { 
       
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    }  
    static boolean isCyclic() {
    	Node fast = head;
    	Node slow = head;
    	
    	while(fast != null && fast.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;	
    		if(fast == slow) {
    			return true;
    		}
    	}
    	return false;
    } 
	public static void main(String[] args) {
		
		LinkedListCheckCyclic linkedList = new LinkedListCheckCyclic(); 
		linkedList.push(101); 
		linkedList.push(201); 
		linkedList.push(301); 
		linkedList.push(401); 
           
        /*Create loop for testing */
	   // linkedList.head.next.next.next.next = linkedList.head; 
        if (isCyclic()) 
            System.out.println("Linked List is Cyclic !!!"); 
        else
            System.out.println("Linked List is Not Cyclic !"); 
    }
}
