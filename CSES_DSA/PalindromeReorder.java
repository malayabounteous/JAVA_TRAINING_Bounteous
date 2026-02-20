package CSES_DSA;

import java.util.*;

public class PalindromeReorder {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        Map<Character,Integer> mpp=new TreeMap<>();
        int n=s.length();
        for(int i=0;i<n;++i)
        {
            mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i),0)+1);
        }
        boolean findodd=false;
        char c='a';
        List<Map.Entry<Character,Integer>> l=new ArrayList<>(mpp.entrySet());
        l.sort((a,b)->b.getValue()-a.getValue());

        for(Map.Entry<Character,Integer>e:mpp.entrySet())
        {
            if(e.getValue()%2==1 ) {
                if (findodd) {
                    System.out.println("NO SOLUTION");
                    return;
                }
                c=e.getKey();
                findodd = true;
            }
        }
        StringBuffer sb=new StringBuffer();

        for(int i=0;i<l.size();++i)
        {
            int half=l.get(i).getValue()/2;
            Character ch=l.get(i).getKey();
            int temp=half;
            if(half==0)
            {
                //sb.append(ch);
                break;
            }
            while(half!=0)
            {
                sb.append(ch);
                half--;
            }

        }
        //System.out.println(sb);
        String s1=new String(sb);
        if(findodd)
            s1+=c;
        sb.reverse();
        s1+=sb;
        System.out.println(s1);
    }
}
