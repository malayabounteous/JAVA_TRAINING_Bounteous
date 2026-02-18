package RealTimeProduct;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class StoreDelete {
    long fixedtime=10*1000*60;//10 minutes
    Queue<OrderEvent>q=new ConcurrentLinkedQueue<>();
    public void addEvent(OrderEvent e)
    {
        q.add(e);
    }
    public List<OrderEvent> expiredEvent()
    {
        List<OrderEvent>ans=new ArrayList<>();
        long timenow=System.currentTimeMillis();

        while(!q.isEmpty())
        {
            OrderEvent e=q.peek();
            if(timenow-e.timestamp>fixedtime)
            {
                ans.add(q.poll());
            }
        }
        return ans;
    }

}
