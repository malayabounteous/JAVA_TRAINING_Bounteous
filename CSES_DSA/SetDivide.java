//package CSES_DSA;

import java.util.*;
import java.util.Scanner;

public class SetDivide {
    public static void main(String []args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        long sum=(long)n*(n+1)/2;
        if(sum%2==1)
        {
            System.out.println("NO");
            return;
        }
        sum/=2;
        int[]arr=new int[n+1];
        List<Integer>arr1=new ArrayList<>();
        int ind=n;
        int x=n;
        while(sum>0)
        {
            if(sum>=n)
            {
                arr[n]=-1;
                arr1.add(n);
                sum-=n;
            }
            n--;
        }
        System.out.println("YES");
        System.out.println(arr1.size());
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<arr1.size();++i)
        {
            sb.append(String.valueOf(arr1.get(i))+" ");
        }
        System.out.println(sb);
        //System.out.println();

        System.out.println(x-arr1.size());
        StringBuffer bf1=new StringBuffer();
        for(int i=1;i<=x;++i)
        {
            if(arr[i]!=-1)
                bf1.append(String.valueOf(i)+" ");
        }
        System.out.println(bf1);

    }
}
