public class CreateLinkedList {
    static class Node{
        int value;
        Node next;
        
        Node(int value){
            this.value=value;
        }
    }

    static class LinkedList{
        Node head=null;
        Node tail=null;

        void add(int value){
            Node n=new Node(value);
            if(head==null){
                head=n;
            }
            else{
                tail.next=n;
            }
            tail=n;
        }

        void display(){
            Node start=head;
            while(start!=null){
                System.out.print(start.value+" ");
                start=start.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(29);
        ll.add(90);
        ll.add(54);
        ll.add(89);

        ll.display();

    }
}
