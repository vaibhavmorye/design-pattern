package Observer.stage1;

public class PaymentManager {

    private  final PaymentEventLogger paymentEventLogger = new PaymentEventLogger();
    private final NotificationManager notificationManager = new NotificationManager();

    public void pay(){
       System.out.println("pay");
       paymentEventLogger.logEvent();
       notificationManager.sendNotificatin();
    }


}
