package Queue;

public class Remove {
    static class Queue{
        int f=-1;
        int r=-1;
        int size=0;
        int a[]=new int[5];
        public void add(int val){
            if(r==a.length-1){
                System.out.print("full");
                return;
            }
            if(f==-1){
                f=r=0;
                a[r]=val;
            }
            else{
                a[++r]=val;
            }
            size++;
        }
        public void display(){
            for(int i=f;i<=r;i++){
                System.out.print(a[i]+" ");
            }
        }
        public int remove(){
            if(size==0){
                System.out.println("empty queue");
                return -1;
            }
            else{
                f++;
                size--;
            }
            return a[f-1];
        }
    }
    public static void main(String[] args) {
        Queue a=new Queue();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        System.out.println(a.remove());
        a.display();
    }
}
