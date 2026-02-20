package MultithreadingDemo;

 class consumer extends  Thread {
     private SharedResource resource;

     public  consumer(SharedResource s)
     {
         resource=s;
     }
     public void run()
     {
         try {
             for (int i = 1; i <= 5; ++i) {
                 resource.consume(i);
                 Thread.sleep(500);
             }
         }
         catch(Exception e)
         {

         }
     }
}
