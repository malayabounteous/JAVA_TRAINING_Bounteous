// package CSESDSA;

import java.util.Scanner;

public class Permutation {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        if(n==3 || n==2){
            System.out.println("NO SOLUTION");
            return;
        }
        if(n==4)
        {
            System.out.print(3+" ");
            System.out.print(1+" ");
            System.out.print(4+" ");
            System.out.print(2);
            return;
        }
       // long x=n;
        int i=1;
        StringBuilder sb=new StringBuilder();
        while(i<=n)
        {
            sb.append(String.valueOf(i)+" ");
            i+=2;

        }
        int j=2;
        while(j<=n)
        {
            sb.append(String.valueOf(j)+" ");
            j+=2;

        }
        System.out.println(sb);
        return;
    }
}
