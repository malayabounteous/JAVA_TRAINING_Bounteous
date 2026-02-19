package Encapsulation;

import java.util.Scanner;

public class MissingNumber {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        int n=sc.nextInt();
        
        long sum=(long)n*(n+1)/2;
        long summ=0;
        while(n!=1)
        {
            int x=sc.nextInt();
            summ+=x;
            n--;
        }

        System.out.println(sum-summ);


    }
}
