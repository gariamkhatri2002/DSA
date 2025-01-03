package Stack;

import java.util.Stack;

public class DeleteAtAny {
    static void delete(Stack<Integer> st,int index){
        Stack<Integer> temp=new Stack<>();
        while(st.size()>index){
            temp.push(st.pop());
        }
        st.pop();
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
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        delete(st, 3);
        display(st);
        
        
    }
}
