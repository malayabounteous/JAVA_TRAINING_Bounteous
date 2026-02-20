package EvenOddMultiThread;

public class Even extends  Thread{
 private OddEven obj;
 public Even(OddEven o)
 {
     obj=o;
 }
    public void run()
    {
        try {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0)
                    obj.even_func(i);
            }
        }
        catch(Exception e)
        {

        }
    }
}
