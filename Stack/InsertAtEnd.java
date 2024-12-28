package Stack;

import java.util.Stack;

public class InsertAtEnd {
    static void pushlast(Stack<Integer> st,int val){
        Stack<Integer> temp=new Stack<>();
        temp.push(val);
        while(st.size()>0){
            temp.push(st.pop());
        }
        
        while(temp.size()>0){
            System.out.print(temp.pop()+" ");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        pushlast(st,67);

    }
}
