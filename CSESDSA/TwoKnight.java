// package CSESDSA;
import java.util.*;

public class TwoKnight {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        long i=1;
        List<Long>ans=new ArrayList<>();
       
        while(i<=n)
        {
            if(i==1)
            {
                ans.add((long)0);
                i++;
                continue;
            }
            if(i==2)
            {
                ans.add((long)6);
                i++;
                continue;
            }
            long t=(i*i*(i*i -1))/2;
            long attack=4*(i-1)*(i-2);
            t=t-attack;
            ans.add(t);
            i++;
        }
        for(long x:ans)
        {
            System.out.println(x);
        }

    }
}
