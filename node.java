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
    public void insert(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void print(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
}
public class node {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insert(30);
        list.insert(60);
        list.insert(50);
        list.print();
    }
}
