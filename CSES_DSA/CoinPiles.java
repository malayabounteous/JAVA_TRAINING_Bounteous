//package CSES_DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinPiles {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        //List<String> ans=new ArrayList<>();
        StringBuffer ans=new StringBuffer();
        while(n>0)
        {
            long x=sc.nextLong();
            long y=sc.nextLong();

            if((x+y)%3==0 && Math.max(x,y)<=2*Math.min(x,y))
                ans.append("YES\n");
            else
                ans.append("NO\n");
            n--;

        }
        System.out.println(ans);
    }
}      
