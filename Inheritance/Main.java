package Inheritance;

public class Main {
    
    public static void main(String[] args) {
       
        Animal a=new Animal(3, "white");
        a.getAnimal();
        Cat c=new Cat();
        c.getAnimal();
        //c.detail();
       // a.detail();
        //run tiime poly not work for static method
       // Animal a1=new Cat();
        //a1.detail();//animal detail print so does not follow run time polymorhipsm
        //a1.getAnimal();
       
        Animal a2=new Cat();
        a2.getAnimal();


        Calculator obj=new Calculator();
       System.out.println( "sum is="+ obj.add(2.7,4));
    
        
    }
}
