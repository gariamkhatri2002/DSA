public class CreateNode {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(78);
        Node c=new Node(90);
        Node d=new Node(55);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;

        System.out.print(a.data+" "+b.data+" "+c.data+" "+d.data);
    }
}
