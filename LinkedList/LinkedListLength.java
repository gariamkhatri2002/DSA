public class LinkedListLength {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    static int display(Node head){
        int length=0;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            length++;
            temp=temp.next;
        }
        System.out.println();
        return length;

    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;

        System.out.println("linkedlist length :"+display(a));
    }
}
