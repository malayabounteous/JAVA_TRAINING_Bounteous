package EvenOddMultiThread;

public class Main {
    public static void main( String[]args) {
      OddEven obj=new OddEven();
      Even t1=new Even(obj);
      Odd t2=new Odd(obj);
      t1.start();
      t2.start();
    }
}
