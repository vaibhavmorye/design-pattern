package Observer.stage2;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager implements PaymentSubject {

    private final List<PaymentListener> paymentListeners = new ArrayList<>();
    //  private  final PaymentEventLogger paymentEventLogger = new PaymentEventLogger();

    public void pay() {
        System.out.println("pay");
        // paymentEventLogger.logEvent();
        // notificationManager.sendNotificatin();
        paymentListeners.forEach(paymentListener -> paymentListener.paymentMade());
    }
    // private final NotificationManager notificationManager = new NotificationManager();


    @Override
    public void unRegisterPaymentListener(PaymentListener paymentListener) {
        paymentListeners.remove(paymentListener);
    }

    @Override
    public void registerPaymentListener(PaymentListener paymentListener) {
        paymentListeners.add(paymentListener);
    }
}
