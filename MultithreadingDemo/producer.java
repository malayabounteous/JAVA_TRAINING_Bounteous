package MultithreadingDemo;

 class producer extends  Thread {
    private SharedResource resource;

    public  producer(SharedResource s)
    {
        resource=s;
    }
    public void run()
    {
        try {
            for (int i = 1; i <= 5; ++i) {
                resource.produce(i);
                Thread.sleep(500);
            }
        }
        catch(Exception e)
        {

        }
    }


}
