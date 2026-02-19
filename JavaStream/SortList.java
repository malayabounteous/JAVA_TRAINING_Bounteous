package JavaStream;

import java.util.Comparator;
import java.util.List;

public class SortList {
    
    public static void main(String[] args) {
         List<Integer>l=List.of(3,50,6,7,9,231,24,46,67,78);
         //ascending order
        List<Integer> ans=l.stream().sorted().toList();
        System.out.println(ans);
        //descending order
        ans=l.stream().sorted((a,b)->b-a).toList();
        System.out.println(ans);
         ans=l.stream().sorted(Comparator.comparing(n->n,Comparator.reverseOrder())).toList();
         System.out.println(ans);
    }
}
