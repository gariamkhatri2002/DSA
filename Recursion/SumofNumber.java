package Recursion;

import java.util.Scanner;

public class SumofNumber {
    static int sum(int start,int end){
        if(start>end){
            return 0;
        }
        return sum(start+1, end)+start;
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the starting number:");
        int start=oc.nextInt();
        System.out.print("Enter the ending number:");
        int end=oc.nextInt();
        System.out.println(sum(start, end));
    }
}
