package PrimeNonprimeMultithread;

public class Main {
    public static void main(String[]args) {

        Prime p=new Prime();
        NonPrime n=new NonPrime();
         boolean lock=true;
        


         Thread t1=new Thread(p);
         Thread t2=new Thread(n);
         t1.start();
         t2.start();


    }
}
