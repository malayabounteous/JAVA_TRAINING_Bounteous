package Abstraction;

public class Main {
    public static void main(String[] args) {
        Notification n=new SmsNotification();
        n.send();
    }
}
