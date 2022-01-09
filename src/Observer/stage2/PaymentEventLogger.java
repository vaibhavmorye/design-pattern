package Observer.stage2;

public class PaymentEventLogger implements PaymentListener {

    private void logEvent() {
        System.out.println("merchent payment done Log");

    }

    @Override
    public void paymentMade() {
        logEvent();
    }
}
