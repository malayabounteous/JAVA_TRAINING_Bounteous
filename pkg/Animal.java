package pkg;
public class Animal implements NOtification{
      
    public void sms()
    {
        System.out.println("implementing notification function");
    }
    //override the default method
    public void count()
    {
        System.out.println("override the method in animal class");
    }
    public void config()//it is different from the config of interface
    {
        System.out.println("insdie the animal config");
    }
    public  void talk()
    {
        System.out.println("it is a static method in Animal talk");
    }
    public static void main(String[] args) {
        
        Animal a=new Animal();
        a.sms();
        a.count();
        NOtification.config();
       
    }

}
