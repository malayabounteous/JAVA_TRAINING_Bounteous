package CSES_DSA;

import java.util.Scanner;

public class CoinPiles {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        while(n>0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            
            if(x==y && x%3==0)
            {
                System.out.println("YES");
                n--;
                continue;
            }
            else if(x*2==y || x==2*y)
            {
                System.out.println("YES");
                n--;
                continue;
            }
            else if()


        }
    }
}      
