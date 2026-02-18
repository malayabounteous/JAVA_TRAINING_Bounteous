package RealTimeProduct;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductFrequencyCounter {
    ConcurrentHashMap<String,AtomicInteger>frequency=new ConcurrentHashMap<>();


    public void increment(String prodid)
    {
        frequency.computeIfAbsent(prodid,p-> new AtomicInteger()).incrementAndGet();
    }

    public void decrement(String prodid)
    {
       AtomicInteger cnt=frequency.get(prodid);
       if(cnt==null)return;
       if(cnt.decrementAndGet()<=0)
       {
        frequency.remove(prodid);
       }

    }
    public Map<String,AtomicInteger>getall()
    {
        return frequency;
    }
}
