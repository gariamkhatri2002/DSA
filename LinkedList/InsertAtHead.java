public class InsertAtHead {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;

        }
    }
    static class LinkedList{
        Node head=null;
        Node tail=null;

        void add(int val){
            Node a=new Node(val);
            if(head==null){
                head=a;
            }
            else{
                tail.next=a;
            }
            tail=a;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void insert(int value){
            Node s=new Node(value);
            if(head==null){
                head=s;
                tail=s;
            }
            else{
                s.next=head;
                head=s;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);

        l.insert(54);
        l.display();
    }
}
