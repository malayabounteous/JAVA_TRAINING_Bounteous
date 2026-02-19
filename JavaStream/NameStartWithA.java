package JavaStream;

import java.util.ArrayList;
import java.util.List;

public class NameStartWithA {
    public static void main(String[] args) {
         List<String>l=new ArrayList<>();
         l.add("Malaya sahu");
         l.add("Anand kumar");
         l.add("Rishav");
          System.out.println(l);
         List<String>ans=l.stream().filter(name->name.startsWith("A")).toList();
         System.out.println(ans);
    }
}
