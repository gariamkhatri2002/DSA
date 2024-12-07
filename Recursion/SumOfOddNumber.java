package Recursion;

import java.util.Scanner;

public class SumOfOddNumber {
    static int sum(int start,int end){
        if(start>end){
            return 0;
        }
        
        if(start%2==1){
            
            System.out.print(start+" ");
            return sum(start+1,end)+start;
        }
        return sum(start+1,end);
        
        
    }

    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter the starting point:");
        int start=oc.nextInt();
        System.out.print("enter the ending point:");
        int end=oc.nextInt();
        System.out.println(sum(start,end));
    }
}
