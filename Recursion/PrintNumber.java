package Recursion;

import java.util.Scanner;

public class PrintNumber {
    /*static void printnumber(int n){
        if(n==0){
            return;
        }
        printnumber(n-1);
        System.out.print(n+" ");
    }*/

    static void naturalnumber(int start,int end){
        if(start>end){
            return;
        }
        naturalnumber(start, end-1);
        System.out.print(end+" ");
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        /* 
        System.out.print("Enter the number:");
        int n=oc.nextInt();
        printnumber(n);
        */

        System.out.print("Enter the starting number:");
        int start=oc.nextInt();
        System.out.print("Enter the ending number:");
        int end=oc.nextInt();
        naturalnumber(start, end);
    }
}
