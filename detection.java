class Node{
    int data;
    Node next;
    Node(int data){ 
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            temp.next=newnode;

        }
        public void delete(){
            if(head==null){
                System.out.println("nothing to delete");
                return;
            }
        
                head=head.next;
            
        }
        public void print(){
            Node temp=head;
            while(temp.next!=null){
                System.out.println(temp+"->");
                temp=temp.next;
            }
            System.out.println("null");
        


    }
}

public class detection {
    public static void main(String[]args){
        LinkedList list=new LinkedList();
        list.add(30);
        list.add(50);
        list.add(70);
        list.add(49);
        list.delete();
        list.print();
 
    }
}
