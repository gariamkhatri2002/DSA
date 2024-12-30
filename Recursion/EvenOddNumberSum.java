package Recursion;

import java.util.Scanner;

public class EvenOddNumberSum {
    static int sumofeven(int start,int end,int sum){
        if(start>end){
            return 0;
        }
        
        if(start%2==0){
            // System.out.print(start+" ");
            sum=sumofeven(start+1, end,sum)+start;
            // System.out.print(sum+" ");
            
        }
        
        // sum=20;
        // System.out.print(sum);
        return sumofeven(start+1, end,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting number:");
        int start=sc.nextInt();
        System.out.print("Enter the ending number:");
        int end=sc.nextInt();
        int sum=0;
        System.out.println(sumofeven(start, end,sum));
    }
}
