package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    static boolean isBalanced(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }
        }
        if(st.size()>0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter String:");
        String s=oc.nextLine();
        isBalanced(s);
        if(isBalanced(s)){
            System.out.print("valid parenthesis");
        }
        else{
            System.out.print("not valid parenthesis");
        }
    }
}
