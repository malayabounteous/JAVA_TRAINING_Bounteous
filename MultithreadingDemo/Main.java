package MultithreadingDemo;

public class Main {
    public static void main() {

        SharedResource r=new SharedResource();
        producer p=new producer(r);
        consumer c=new consumer(r);
        p.start();
        c.start();


    }
}
