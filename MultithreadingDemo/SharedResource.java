package MultithreadingDemo;

 class SharedResource {
    private int data;
    private boolean available=false;

    synchronized void produce(int value)throws InterruptedException
    {
        while(available)
        {
            wait();
        }
        data=value;
        available=true;
        System.out.println("produced "+data);
        notify();
    }

    synchronized void consume(int data)throws InterruptedException
    {
        while(!available)
        {
            wait();
        }

        System.out.println("consumed "+data);
        available=false;
        notify();
    }
}
