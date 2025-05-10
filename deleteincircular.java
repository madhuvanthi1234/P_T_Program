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

    public void delete2() {
        if (tail == null) return;

        Node current = tail.next;
        Node prev = tail;

        do {
            if (current.data == 2) {
                if (current == tail && current == tail.next) {
                    tail = null;
                } else {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev;
                    }
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != tail.next);
    }
}

public class deleteincircular {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addToTail(1);
        cll.addToTail(2);
        cll.addToTail(3);
        cll.addToTail(4);
        cll.addToTail(5);

        System.out.println("Before deleting 2:");
        cll.display();

        cll.delete2();

        System.out.println("After deleting 2:");
        cll.display();
    }
}
