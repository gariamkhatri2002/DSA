package Recursion;

import java.util.Scanner;

public class Reverse {
    static void reverseNum(int n){
        if(n==0){
            return;
        }
        System.out.print(n%10);
        reverseNum(n/10);

    }
    
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=oc.nextInt();
        reverseNum(n);
        // System.out.println(reverseNumber(n));
    }
}
