class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class deletedouble {
    Node head;

    
    public void deleteFromBeginning() {
        if (head == null) return;

        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    
    public void deleteFromEnd() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    
    public void deleteByValue(int value) {
        if (head == null) return;

        Node temp = head;

        
        if (temp.data == value) {
            deleteFromBeginning();
            return;
        }

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

       
        if (temp == null) return;

        
        if (temp.next == null) {
            deleteFromEnd();
            return;
        }

        
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    
    public void display() {
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

   
    public static void main(String[] args) {
        deletedouble dll = new deletedouble();

        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.display();

        dll.deleteByValue(30);  
        dll.display();

        dll.deleteFromBeginning(); 
        dll.display();

        dll.deleteFromEnd(); 
        dll.display();
    }

    
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
}
