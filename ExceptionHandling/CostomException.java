package ExceptionHandling;

public class CostomException extends Exception{
        
    int code;
    //String msg;
        public CostomException(String msg){
            super(msg);
        }

}
