 package CSESDSA;

import java.util.Scanner;

public class IncreseingArray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i=0;
        int prev=-1;
        long ans=0;
        while(i<n)
        {
            int x=sc.nextInt();
            if(x<prev)
            {
               ans+=(long)prev-x;
               x=prev;
            }
            prev=x;
            i++;
        }
        System.out.println(ans);
    }
}
