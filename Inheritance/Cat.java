package Inheritance;

public class Cat extends Animal {

    public Cat(){//inserted by compiler
        super(5,"orange");
    }
    public void walk()
    {
        System.out.println("cat is walking");
    }
     public void getAnimal()// we can override this method in cat class
    {
        System.out.println("Animal age is = "+age);
        System.out.println("Animal color is = "+color);
    } 
    public static void detail()//static mehtod an not be overriden
    {
        System.out.println("cat details here");
    }
}
