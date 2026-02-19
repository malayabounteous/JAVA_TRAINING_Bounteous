package JavaStream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class EmployeeClass {
    private int ID;
    private String Name;
    private String email;
    private double Salary;

    public EmployeeClass(int i, String s, String e, double d) {
        this.ID = i;
        this.Name = s;
        this.Salary = d;
        this.email=e;
    }

    public double getSalary()
    {
        return Salary;
    }
    public String getName()
    {
        return Name;
    }
    public String getemail()
    {
        return email;
    }

}

public class Employee {
    public static void main(String[] args) {

        List<EmployeeClass> emp = new ArrayList<>();
        emp.add(new EmployeeClass(1, "Malaya Sahu","mlaaya75902@gmail.com", 23000));
        emp.add(new EmployeeClass(2, "Chnadan Sahu","mlaaya75902@gmail.com", 45000));
        emp.add(new EmployeeClass(3, "Prabir ku Sahu","sahu5654@gmail.com", 90000));
        emp.add(new EmployeeClass(4, "Rishav kumar ","rishavku@gmail.com", 83000));
        
        List<String>ans=emp.stream().filter(e->e.getSalary()>50000).map(e->e.getName()).toList();
        ans.forEach(e->System.out.println(e));

        ans=emp.stream().sorted(Comparator.comparing(e->((EmployeeClass)e).getName()).thenComparing(Comparator.comparing(e->((EmployeeClass)e).getSalary()))).map(e->e.getName()).toList();

       System.out.println(ans);
        //delete duplicate key as mail
      Map<String,String>map= emp.stream().collect(Collectors.toMap(EmployeeClass::getemail,EmployeeClass::getName,(e1,e2)->e2));
      System.out.println(map);

      //Map<String,List<String>>map1= emp.stream().collect(Collectors.groupingBy(EmployeeClass::getemail)).entrySet().
      // System.out.println(map1);
    }
}
