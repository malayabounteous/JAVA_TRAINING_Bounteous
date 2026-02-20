package Multithreadqn1;

public class SharedRes {
    
    public void show()
    {
        for(int i=0;i<100;++i)
        {
            System.out.println(Thread.currentThread().getName()+ "->"+i);
        }
    }
}
