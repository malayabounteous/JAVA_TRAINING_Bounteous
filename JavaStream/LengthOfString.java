package JavaStream;

import java.util.ArrayList;
import java.util.List;

public class LengthOfString {
    public static void main(String[] args) {
         List<String>l=new ArrayList<>();
         l.add("mlaaya sahu");
         l.add("chndan kumar");
         l.add("rishav");
          System.out.println(l);
         List<Integer>ans=l.stream().map(name->name.length()).toList();
         System.out.println(ans);
    }
          
}
