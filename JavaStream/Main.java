package JavaStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
    
    public static void main(String[] args) {
        
        List<Integer>l=new ArrayList<>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(24);
        l.add(28);
        l.add(45);
        

       Stream<Integer>s=l.stream();
       s.filter(n->n%2==0).forEach(e->System.out.println(e));
    //PREDICATE n->n%2==0
    //FUNCTION ->aply this function to given element
    // COMPARATOR 
    List<Integer>l1=List.of(1,2,3,4,5,5,6,7,8,9);
    List<Integer>l2= l1.stream().map(n->n*2).toList();
    System.out.println(l2);
    l1.stream().map(n->n+1).forEach(System.out::println);
    //use of limit
    long l3=l1.stream().limit(3).filter(n->n%2==1).count();
    System.out.println("count of "+l3);
    //use of count
    long cnt=l1.stream().filter(n->n%2==0).count();
    System.out.println(cnt);


    //PRACTICE
        int[] ar={23,54,76,235,13,12};

        List<Integer>arr=Arrays.stream(ar).boxed().collect(Collectors.toList());

        long beforeTime=System.currentTimeMillis();
        arr.stream().peek(e-> System.out.println(e)).filter(n->n%2==0).forEach(System.out::println);

        System.out.println("Time in stream " + (System.currentTimeMillis()-(long)beforeTime));

        long before=System.currentTimeMillis();
        arr.parallelStream().peek(e-> System.out.println(e)).filter(n->n%2==0).forEach(System.out::println);

        System.out.println("Time in pallel stream "+(System.currentTimeMillis()-before));





//        Optional<Integer> sum=arr.stream().reduce((a,b)->a+b);
//        System.out.println(sum);
//
//        Optional<Integer> min=arr.stream().min((a,b)->a-b);
//        System.out.println("minimum= "+min);









    }
}
