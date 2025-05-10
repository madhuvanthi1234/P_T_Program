class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node tail;

   
    public CircularLinkedList() {
        tail = null;
    }

   
    public void addToTail(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
           
            tail = newNode;
            tail.next = tail; 
        } else {
            Node head = tail.next;
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    
    public void display() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = tail.next; 
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != tail.next);
        System.out.println();
    }
}

public class inserttailcircular {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

       
        cll.addToTail(1);
        cll.addToTail(2);
        cll.addToTail(3);
        cll.addToTail(4);

        System.out.println("Before inserting 5:");
        cll.display();

        
        cll.addToTail(5);

        System.out.println("After inserting 5 at tail:");
        cll.display();
    }
}
