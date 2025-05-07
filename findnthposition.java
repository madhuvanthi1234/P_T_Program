class findnthposition {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    
    public Node findNthFromEnd(int position) {
        Node slow = head;
        Node fast = head;

        
        for (int i = 0; i < position; i++) {
            if (fast == null) return null; 
            fast = fast.next;
        }

       
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        
        return slow;
    }

    public static void main(String[] args) {
        findnthposition dll = new findnthposition();
        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.append(40);
        dll.append(50);

        int position = 2; 
        Node result = dll.findNthFromEnd(position);
        
         System.out.println(result.data);
       
    }
}
