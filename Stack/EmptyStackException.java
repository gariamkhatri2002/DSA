package Stack;

import java.util.Stack;

public class EmptyStackException {
    public static void main(String[] args) {
        Stack st=new Stack<>();
        st.push("hello");
        st.push(2);
        st.push("garima");
        st.push(78);
        st.push(89);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
      
    }
}
