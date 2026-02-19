package JavaStream;
import java.util.*;
public class EvenNumber {
    
    public static void main(String[] args) {
        List<Integer>l=List.of(1,2,3,4,5,6,7,84,4);
    
    List<Integer>ans=l.stream().filter(n->n%2==0).toList();
    System.out.println(ans);
    }
    
    
}
