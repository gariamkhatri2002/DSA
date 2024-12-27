package Stack;

import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        // Stack<Integer> rt=new Stack<>(st);               this statement gives a error 
        Stack<Integer> rt=new Stack<>(); 
        // rt.addAll(st);
        while(st.size()>0){
            int x=st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(st);
        System.out.println(rt);

    }
}
