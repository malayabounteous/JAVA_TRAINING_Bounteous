package JavaStream;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class GroupBy {
    public static void main(String[] args) {
        
        List<Integer>l=List.of(2,54,59,6,4,22,35,47);
        //USE OF GROUP BY
        Map<Integer,List<Integer>>map=l.stream().collect(Collectors.groupingBy(e->e%2));
        System.out.println(map);
        //USE OF MAX
        Integer maxi=l.stream().max(Integer::compare).get();
        System.out.println(maxi);
        //USING OF TOMAP key should be unique
        Map<Integer,Integer>map2=l.stream().collect(Collectors.toMap(x->x, x->x*x));
        System.out.println(map2);
        //USING Joining
        String s = Stream.of("Java","is","cool").collect(Collectors.joining(" "));
        System.out.println(s);
        //






    }
}
