public class PrintThroughRecursion {
    //NODE CLASS
    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }
    //PRINT FORWARD DIRECATION
    static void forwardprint(Node head){
        
        if(head==null){
            return;
        }
        System.out.print(head.value+" ");
        forwardprint(head.next);
    }
    
    //PRINT BACKWARD DIRECATION
    static void backwardprint(Node head){
        
        if(head==null){
            return;
        }
        backwardprint(head.next);
        System.out.print(head.value+" ");
        
    }
    
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        
        a.next=b;
        b.next=c;
        c.next=d;
        forwardprint(a);
        System.out.println();
        backwardprint(a);
    }
}
