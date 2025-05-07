import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeSortedLinkedLists {

    
    public static ListNode mergeSortedLists(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

      
        if (head1 != null) tail.next = head1;
        if (head2 != null) tail.next = head2;

        return dummy.next;
    }

   
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    
    public static ListNode createList(Scanner sc, int size) {
        if (size == 0) return null;

        System.out.print("Enter value 1: ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;

        for (int i = 2; i <= size; i++) {
            System.out.print("Enter value " + i + ": ");
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements in first sorted list: ");
        int n1 = sc.nextInt();
        ListNode head1 = createList(sc, n1);

       
        System.out.print("Enter number of elements in second sorted list: ");
        int n2 = sc.nextInt();
        ListNode head2 = createList(sc, n2);

       
        ListNode merged = mergeSortedLists(head1, head2);
        System.out.print("Merged Sorted List: ");
        printList(merged);

        sc.close();
    }
    

}
