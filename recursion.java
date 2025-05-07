class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class recursion {

   
    public static ListNode insertAtIndex( int value, int index,ListNode head) {
        
        if (index == 0) {
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            return newNode;
        }

        
        if (head == null) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }

       
        head.next = insertAtIndex ( value,index - 1,head.next);
        return head;
    }

   
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    
    
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);

        System.out.print("Original list: ");
        printList(head);

        
        head = insertAtIndex(3, 2,head);

        System.out.print("After insertion: ");
        printList(head);
    }
}
