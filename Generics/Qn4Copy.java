package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Mycopy {

    public static<T> void copy(List<? super T> dest, List<? extends T>source)
    {
        for(T el:source)
        {
          dest.add(el);
        }
    }
}

public class Qn4Copy {
    static void main() {

        List<Integer>l1= Arrays.asList(1,2,3,4);
        List<Number>l2=new ArrayList<>();
        System.out.println("Before copying "+l2);
        Mycopy.copy(l2,l1);
        System.out.println("After copied "+l2);

    }
}
