public class Inher implements Notification {

    public static void main(String[] args) {
        
        Inher obj=new Inher();
        obj.smsNotification();
    }
    public void smsNotification(){
        System.out.println("inside function of interface");
    }

}


 interface Notification {
    void smsNotification();//abstract mehtod do not specify the body
    //deafult access is public beacause it has to be implemented by a class 
    //

}