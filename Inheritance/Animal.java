package Inheritance;

public class Animal {
    int age;
    String color;
    public Animal()
    {
        age=0;
        color=null;
    }
    public Animal(int age,String color)
    {
      this.age=age;
      this.color=color;
    }
    public void getAnimal()
    {
        System.out.println("Animal age is = "+age);
        System.out.println("Animal color is = "+color);
    }
    public static void detail()//static method can not be overriden
    {
        System.out.println("Animal Details here");
    }




}
