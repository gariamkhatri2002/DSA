package Recursion;

import java.util.Scanner;

public class TablePrint {
    static void printn(int start,int end,int num){
        if(start>end){
            return;
        }
        
        System.out.print(start*num+" ");
        printn(start+1,end,num);
        
    }

    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter the starting point:");
        int start=oc.nextInt();
        System.out.print("enter the ending point:");
        int end=oc.nextInt();
        System.out.print("enter the number:");
        int num=oc.nextInt();
        printn(start,end,num);
        
    }
}
