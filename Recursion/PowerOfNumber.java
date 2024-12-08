package Recursion;

import java.util.Scanner;

public class PowerOfNumber {
    static int powerofNumber(int num,int power){
        
        if(power==0){
            return 1;
        }
        int ans=powerofNumber(num,power-1);
        
        ans=ans*num;
        return ans;
        
    }

    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=oc.nextInt();
		System.out.print("Enter the power:");
		int power=oc.nextInt();
		System.out.print(powerofNumber(num,power));

    }
}
