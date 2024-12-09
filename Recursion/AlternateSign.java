package Recursion;

import java.util.Scanner;

public class AlternateSign {
    static int sign(int n){
        int total=0;
        if(n==1){
            System.out.print("+"+n);
            total=n;
            return 1;
        }
        
        if(n%2==0){
            System.out.print("+"+n);
            total=sign(n-1)+n;
        }
        if(n%2==1){
            System.out.print("-"+n);
            total=sign(n-1)-n;
            System.out.println();
        }
        
        return total;
        
    }

    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=oc.nextInt();
		System.out.print(sign(n));

    }
}
