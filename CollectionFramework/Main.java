package CollectionFramework;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        //qn1-Student Attendance System
        Scanner sc=new Scanner(System.in);
        /* Set<String>student=new HashSet<>();
       

       while(true)
       {
        String name=sc.next();
        student.add(name);
        System.out.println("want to add more name (yes or no)");
        String check=sc.next();
        if(check.equals("no"))
         {
            break;
         }

       }
        System.out.println(student);*/
    
        //qn-2 shopping cart system

       /*  List<String>items=new ArrayList<>();
        while(true)
       {
        String item=sc.next();
        student.add(item);
        System.out.println("want to add more item (yes or no)");
        String check=sc.next();
        if(check.equals("no"))
         {
            break;
         }

       }
        System.out.println(items);*/

      //qn3- count number of each products

     /*  Map<String,Integer>prodcount=new HashMap<>();
       while(true)
       {
        String item=sc.next();
        prodcount.put(item,prodcount.getOrDefault(item, 0)+1);
        System.out.println("want to add more name (yes or no)");
        String check=sc.next();
        if(check.equals("no"))
         {
            break;
         }

       }
       System.out.println(prodcount);*/


        //qn4-remove duplicates from list
        
      /*   List<Integer>list=new ArrayList<>();

         while(true)
       {
        int item=sc.nextInt();
        list.add(item);
        System.out.println("want to add more name (yes or no)");
        String check=sc.next();
        if(check.equals("no"))
         {
            break;
         }

       }

       System.out.println("orifginal list or array -"+list); 
       Set<Integer>set=new HashSet<>(list);
       System.out.println("after removing duplicate from list or array -"+set);*/



       //qn-6-find highest score
       
     /*   List<Integer>list=new ArrayList<>();
        while(true)
       {
        int item=sc.nextInt();
        list.add(item);
        System.out.println("want to add more name (yes or no)");
        String check=sc.next();
        if(check.equals("no"))
         {
            break;
         }

       }

       System.out.println(Collections.max(list));*/

     //qn-7 queue system 

    /*  Queue<Integer>q=new LinkedList<Integer>();
      while(true)
       {
        int item=sc.nextInt();
        q.add(item);
        System.out.println("want to add more name (yes or no)");
        String check=sc.next();
        if(check.equals("no"))
         {
            break;
         }

       }
       System.out.println(q);
       System.out.println(q.peek());*/

       //qn-8 store employee id and name
       
       Map<Integer,String>map=new HashMap<>();
       map.put(1,"malaya");
       map.put(2,"rishav");
       map.put(3,"vansh");
       System.out.println(map);

       //qn9-sort names
       List<String>names=new ArrayList<>();
       names.add("malaya");
       names.add("sahu");
       names.add("risav");

       Collections.sort(names);
       System.out.println(names);

     //qn 10-

     List<Integer>numlist=new ArrayList<>();
     numlist.add(10);
     numlist.add(20);
     numlist.add(10);
     numlist.add(12);
     numlist.add(12);

     int n=numlist.size();
     for(int i=0;i<n;++i)
     {
      int x=numlist.get(i);
       for(int j=i+1;j<n;++j)
       {
          if(x==numlist.get(j))
          {
            System.out.println(x);
          }
       }
     }


    }
}
