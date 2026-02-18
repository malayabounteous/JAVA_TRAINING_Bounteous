package RealTimeProduct;
import java.util.*;
import java.util.List;

public class TrendingService {
    private StoreDelete store = new StoreDelete();
    private ProductFrequencyCounter productCounter = new ProductFrequencyCounter();
    private RegionFreqCounter regionCounter = new RegionFreqCounter();

    public void processEvent(OrderEvent event) {

        store.addEvent(event);

        productCounter.increment(event.productId);
        regionCounter.incrementRegion(event.region, event.category);

        List<OrderEvent> expired = store.expiredEvent();

        for (OrderEvent e : expired) {
            productCounter.decrement(e.productId);
            regionCounter.decrementRegion(e.region, e.category);
        }
    }

    public List<String> getTop5Products() {
        return TopK.topK(productCounter.getall(), 5);
    }

    public List<String> getTop3Categories(String region) {
        return TopK.topK(regionCounter.getRegion(region), 3);
    }
}
