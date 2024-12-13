public class Reverse {
    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }

    static Node reverse(Node head){
        Node pre=null;
        Node curr=head;
        Node next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=pre;

            pre=curr;
            curr=next;
        }
        return pre;
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

        display(a);
        System.out.println();
        Node rev=reverse(a);
        display(rev);
    }
}
