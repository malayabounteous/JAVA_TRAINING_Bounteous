package RealTimeProduct;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class RegionFreqCounter {
    ConcurrentHashMap<String,ConcurrentHashMap<String,AtomicInteger>>data=new ConcurrentHashMap<>();
    
    public void incrementRegion(String region,String category)
    {
        data.computeIfAbsent(region, r->new ConcurrentHashMap<>()).computeIfAbsent(category, c->new AtomicInteger()).getAndIncrement();
    }

     public void decrementRegion(String region,String category)
    {
        var map=data.get(region);
        if(map==null)return;
        
        AtomicInteger cnt=map.get(category);

        if(cnt.decrementAndGet()<=0)
            map.remove(category);

    
    }
    
    public Map<String,AtomicInteger> getRegion(String region)
    {
        return data.getOrDefault(region,new ConcurrentHashMap<>());
    }




}
