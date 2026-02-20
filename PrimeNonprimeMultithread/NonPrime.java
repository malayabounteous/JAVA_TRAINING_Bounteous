package PrimeNonprimeMultithread;

public class NonPrime implements  Runnable {

    private boolean check_prime(int x)
    {
        for(int i=2;i*i<=x;++i)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public void run()
    {
        for(int i=2;i<=100;++i)
        {
            if(!check_prime(i))
            {
                System.out.println(Thread.currentThread().getName()+"Non Prime "+i);
            }

        }
    }

}
