package Multithreadqn1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) throws Exception {
        
        SharedRes s1=new SharedRes();
        SharedRes s2=new SharedRes();
        SharedRes s3=new SharedRes();
        Thread t1=new Thread(()->s1.show());
        Thread t2=new Thread(()->s2.show());
        Thread t3=new Thread(new Runnable() {
            public void run()
            {
                s3.show();
            }
        });
        // t1.start();
        // t2.start();
        ExecutorService exe=Executors.newFixedThreadPool(2);

        exe.submit(()->{
           System.out.println("task 1"+Thread.currentThread().getName());
        });
      exe.submit(()->{
           System.out.println("task 2"+Thread.currentThread().getName());
        });
       Future<Integer>fut= exe.submit(()->{
           System.out.println("task 3"+Thread.currentThread().getName());
           return  10;
        });
        
        System.out.println(fut.get());
        // System.out.println(fut.get());
        exe.shutdown();


        //ThreadPoolExecutor th=new ThreadPoolExecutor(0, 0, 0, null, null)
    }
}
