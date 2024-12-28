package Stack;

import java.util.Stack;

public class InsertAtBottom {
        static void insert(Stack<Integer> st,int val){
        Stack<Integer> temp=new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        st.push(val);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        
        
    }
    static void display(Stack<Integer> st){
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
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        insert(st,89);
        display(st);

    }
}
