package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    static int sumofdigit(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int sum=sumofdigit(n/10);
        int sum1=sum+(n%10);
        return sum1;
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=oc.nextInt();
        System.out.println(sumofdigit(num));
    }
}
