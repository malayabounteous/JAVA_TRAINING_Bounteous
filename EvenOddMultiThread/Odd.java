package EvenOddMultiThread;

public class Odd extends Thread {
 private OddEven obj;
 public Odd(OddEven o)
 {
     obj=o;
 }
    public void run()
    {
        try {
            for (int i = 1; i <= 100; i++){
                if (i % 2 == 1)
                    obj.odd_func(i);
                }
        }

        catch (Exception e)
        {

        }
    }
}
