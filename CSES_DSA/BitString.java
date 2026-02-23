//package CSES_DSA;

import java.util.*;

public class BitString {
    public static  void main(String[]args)
    {

        Scanner sc=new Scanner(System.in);
        long mod=((long)Math.pow(10,9))+7;
        long n= sc.nextLong();
         long mul=1;
        for(int i=1;i<=n;++i)
        {
            mul*=(long)2;
            mul%=mod;
        }
        System.out.println(mul);


    }
}
