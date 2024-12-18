public class DoublyLinkedList {
    static class Node{
        Node previous;
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);

        a.previous=null;
        a.next=b;
        b.previous=a;
        b.next=c;
        c.previous=b;
        c.next=d;
        d.previous=c;
        d.next=e;
        e.previous=d;
        e.next=null;

        display(a);

    }
}
