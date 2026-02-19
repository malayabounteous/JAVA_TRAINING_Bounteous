package JavaStream;

import java.util.ArrayList;
import java.util.List;

public class NullFilter {
    public static void main(String[] args) {
         List<String>l=new ArrayList<>();
         l.add("mlaaya");
         l.add("chndan");
         l.add(null);
          System.out.println(l);
          List<String>ans=l.stream().filter(name->name!=null).toList();
          System.out.println(ans);
    }
}
