package ComparatorComprable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<Student>list=new ArrayList<>();
        list.add(new Student(10, "malaya sahu"));
        list.add(new Student(89, "chandan sahu"));
        list.add(new Student(12, "prabir"));
        list.add(new Student(20, "rishav jain"));

        System.out.println(list);
        for(Student s:list)
        {
            System.out.println("id="+s.id+" name="+s.name);
        }
        Collections.sort(list,(a,b)->b.id-a.id);
        System.out.println("AFTER SORTING");
        for(Student s:list)
        {
            System.out.println("id="+s.id+" name="+s.name);
        }

    }

}
