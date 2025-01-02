package Stack;

public class PeekMethod {
    public static class Stack{
        int index=0;
        int a[]=new int[5];
        public void push(int val){
            a[index]=val;
            index++;
        }
        public void display(){
            for(int i=0;i<index;i++){
                System.out.print(a[i]+" ");
            }
        }

        int peek() {
            if (index == 0) {
                System.out.println("empty stack");
                return -1;
            }
            return a[index - 1];
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();

        int x = st.peek();
        System.out.println(x);
    }
}
