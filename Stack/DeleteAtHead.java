package Stack;

import java.util.Stack;

public class DeleteAtHead {
    static void display(Stack<Integer> st){
        st.pop();
        Stack<Integer> temp=new Stack<>();
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
        
        display(st);
    }
}
