package CSES_DSA;

import java.util.Scanner;

public class NumberOfZeros {

    public static void main(String[]args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        long ans=0;
        long t=5;
        while((n/t)!=0)
        {
          ans+=(n/t);
          t*=5;
        }
        System.out.println(ans);
    }
}
