package CSES_DSA;

import java.util.Scanner;

public class Repetations {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int ans=0;
        int curr=1;
        for(int i=1;i<n;++i)
        {
          if(s.charAt(i)==s.charAt(i-1))
          {
            curr++;
          }
          else
          {
            ans=Math.max(ans,curr);
            curr=1;
          }
        }
        ans=Math.max(ans,curr);
        System.out.println(ans);
    }
}
