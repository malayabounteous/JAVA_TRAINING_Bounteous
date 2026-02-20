//package CSES_DSA;

import java.util.*;

public class BitString {
    public static  void main(String[]args)
    {

        Scanner sc=new Scanner(System.in);
        long mod=1000000007;
        long n= sc.nextLong();

        if(n>32)
        {
            long ll=1<<62;
            System.out.println(ll%mod);
        }
        else {
            long ll=1<<n;
            System.out.println(ll%mod);
        }

    }
}
