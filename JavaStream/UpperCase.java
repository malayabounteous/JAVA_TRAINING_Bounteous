package JavaStream;
import java.util.*;
public class UpperCase {
    
    public static void main(String[] args) {
        List<String>l=List.of("malaya","sahu","chndan","prabir");
        
        List<String>ans=l.stream().map(name->name.toUpperCase()).toList();
        System.out.println(ans);
    }
}
