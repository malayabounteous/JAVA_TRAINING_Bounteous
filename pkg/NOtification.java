package pkg;
public interface NOtification {
    
    public void sms();

    default void count(){ // default method can be there in interface introduce in java8
         
        System.out.println("inside default method");
    }

    static void config()//static method can not be overriden it only belongs to the iterface
    {
        System.out.println("inside static mehtod from interface");
    }

    
}
