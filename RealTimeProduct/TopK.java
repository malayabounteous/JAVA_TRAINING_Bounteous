package RealTimeProduct;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TopK {

    public static List<String> topK(Map<String, AtomicInteger> map, int k) {

        PriorityQueue<Map.Entry<String, AtomicInteger>> pq = new PriorityQueue<>(
                Comparator.comparingInt(e -> e.getValue().get()));

        for (var e : map.entrySet()) {
            pq.offer(e);
            if (pq.size() > k)
                pq.poll();
        }

        List<String> res = new ArrayList<>();
        while (!pq.isEmpty())
            res.add(pq.poll().getKey());
        Collections.reverse(res);
        return res;
    }

}
