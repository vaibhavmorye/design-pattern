package Observer.stage2;

public class Main {

    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();

        NotificationManager notificationManager = new NotificationManager();
        PaymentEventLogger paymentEventLogger = new PaymentEventLogger();
        paymentManager.registerPaymentListener(notificationManager);
        paymentManager.registerPaymentListener(paymentEventLogger);
        paymentManager.pay();

        paymentManager.unRegisterPaymentListener(notificationManager);
        paymentManager.pay();
    }
}
