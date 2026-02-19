package JavaStream;
import java.util.*;
public class CountDivisible {
    
    public static void main(String[] args) {
        List<Integer>l=List.of(3,50,6,7,9,231,24,46,67,78);
         
        long ans=l.stream().filter(n->n%3==0).count();
        System.out.println(ans);

        
    }
}
