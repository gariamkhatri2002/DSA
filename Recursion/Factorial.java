package Recursion;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        int ans=factorial(n-1);
        
        int fact=ans*n;
        return fact;
        
        // return factorial(n-1)*n;
    }

    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=oc.nextInt();
		System.out.print(factorial(n));

    }
}
