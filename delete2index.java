import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class delete2index {
    Node head;

    
    public void insertAtIndex(int data, int index) {
        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            if (head != null) head.prev = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            insertAtEnd(data);
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    
    public void deleteAtIndex(int index) {
        if (head == null) return;

        if (index == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
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
        delete2index dll = new delete2index();
        Scanner scanner = new Scanner(System.in);

       
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter element " + i + ": ");
            dll.insertAtEnd(scanner.nextInt());
        }

        dll.display();

        
        System.out.print("Enter index to delete and insert at: ");
        int index = scanner.nextInt();

        dll.deleteAtIndex(index);
        System.out.print("Enter new element to insert at index " + index + ": ");
        int newData = scanner.nextInt();

        dll.insertAtIndex(newData, index);
        dll.display();

        scanner.close();
    }
}
