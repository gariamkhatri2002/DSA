package Stack;

import java.util.Stack;

public class ArrayThroughDis {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        int x=s.size();
        System.out.println(x);
        int a[]=new int[x];
        for(int i=x-1;i>=0;i--){
            a[i]=s.pop();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
