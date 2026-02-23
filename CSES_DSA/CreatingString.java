package CSES_DSA;


import java.util.Scanner;
import java.util.TreeSet;

public class CreatingString {

    public void generate(String s, int index,int bitset, StringBuilder sb, TreeSet<String> ans)
    {
        if(index==s.length())
        {
            if(sb.length()==s.length())
                ans.add(String.valueOf(sb));
            return;
        }
        generate(s,index+1,bitset,sb,ans);

        int n=s.length();
        for(int i=0;i<n;++i)
        {
          if((bitset>>i &1)==1)
          {
              continue;
          }
          sb.append(s.charAt(i));
          bitset+=(1<<i);
          generate(s,index+1,bitset,sb,ans);
          sb.deleteCharAt(sb.length()-1);
          bitset-=(1<<i);
        }

    }


    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        CreatingString obj=new CreatingString();
        TreeSet<String>ans=new TreeSet<>();
        StringBuilder sb=new StringBuilder();
        obj.generate(s,0,0,sb,ans);
        System.out.println(ans.size());
        for(String e:ans)
        {
            System.out.println(e);
        }


    }
}
