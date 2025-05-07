import java.util.Scanner;
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
}
class SingleLinkedList{
	Node head;
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	public void printSLL() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data +"->");
			curr = curr.next;
		}
	}
	public Node mergeLinkedList(Node head1, Node head2) {
		Node curr = head1;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = head2;
		return head1;
	}
	
	public void removeDuplicates() {
		Node prev = head;
		Node curr = head.next;
		while(curr != null) {
			if(prev.data == curr.data) {
				curr = curr.next;
				continue;
			}
			prev.next = curr;
			prev = curr;
			curr = curr.next;
		}
		prev.next = null;
	}
	
	
	
	
}
class MergeSortedLinkedLists{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SingleLinkedList sll1 = new SingleLinkedList();
		SingleLinkedList sll2 = new SingleLinkedList();
		while(true) {
			System.out.print("Enter the Value or -1 to quit : ");
			int n = sc.nextInt();
			if(n==-1) {
				break;
			}
			sll1.insertAtEnd(n);	
		}
		System.out.println("----------------------------------------");
		while(true) {
			System.out.print("Enter the Value or -1 to quit : ");
			int n = sc.nextInt();
			if(n==-1) {
				break;
			}
			sll2.insertAtEnd(n);
		}
		
		
		SingleLinkedList sll = new SingleLinkedList();
		Node mergeLinkedList = sll.mergeLinkedList(sll1.head, sll2.head);
		sll.head = mergeLinkedList;
		sll.printSLL();
		
	}
}