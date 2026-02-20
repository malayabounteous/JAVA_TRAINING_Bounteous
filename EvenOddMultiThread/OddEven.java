package EvenOddMultiThread;

public class OddEven {
    private int cntr;
    private boolean lock=true;

    synchronized public void  even_func(int x) throws InterruptedException
    {
        while(lock)
        {
            wait();
        }
        lock=true;
        System.out.println(Thread.currentThread().getName()+" even "+x);
        notify();

    }
    synchronized public void  odd_func(int x) throws InterruptedException
    {
        while(!lock)
        {
            wait();
        }
        lock=false;
        System.out.println( Thread.currentThread().getName()+" odd "+x);
        notify();

    }

}
