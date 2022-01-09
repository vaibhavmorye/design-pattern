package Observer.stage2;

public interface PaymentSubject {

     void unRegisterPaymentListener(PaymentListener p);

     void registerPaymentListener(PaymentListener p);

}
