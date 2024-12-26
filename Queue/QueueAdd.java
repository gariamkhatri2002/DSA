import java.util.*;
public class QueueAdd {
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
    }
    public static void main(String[] args) {
        Queue a=new Queue();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        a.display();
    }
}
