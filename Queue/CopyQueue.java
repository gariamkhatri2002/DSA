package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class CopyQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        Queue<Integer> q1=new LinkedList<>();
        while(q.size()>0){
            q1.add(q.remove());
        }
        // System.out.println(q);
        System.out.print(q1);

        // q.remove();            //THIS STATEMENT GIVE EXCEPTION
        
        System.out.println();
        Queue<Integer> q2=new ArrayDeque<>();
        while(q1.size()>0){
            q2.add(q1.poll());
        }
        // System.out.println(q1.poll());              //THIS STATEMENT GIVE NULL VALUE
        
        System.out.print(q2+" ");
    }
}
