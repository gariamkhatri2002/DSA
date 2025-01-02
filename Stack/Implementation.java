package Stack;

public class Implementation {
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
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
    }
}
