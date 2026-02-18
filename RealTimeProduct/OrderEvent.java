package RealTimeProduct;

public class OrderEvent {
    String orderId; 
    String userId; 
    String productId; 
    String category; 
    String region; 
    long timestamp;
    public OrderEvent(String orderId,String userId,String productId,String category,String region,long timestamp)
    {
        this.orderId=orderId;
        this.userId=userId;
        this.productId=productId;
        this.category=category;
        this.region=region;
        this.timestamp=timestamp;
    }

}
