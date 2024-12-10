public class LinkedList {
    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);

        System.out.print(a.value+" "+b.value+" "+c.value);
    }
}
