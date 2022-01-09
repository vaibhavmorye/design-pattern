package Observer.stage2;

public class NotificationManager  implements PaymentListener{

   private void sendNotificatin() {
       System.out.println("merchent payment done");

    }

    @Override
    public void paymentMade() {
        sendNotificatin();
    }
}
