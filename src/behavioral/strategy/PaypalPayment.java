package behavioral.strategy;

public class PaypalPayment implements PaymentStrategy{

    @Override
    public void processPayment(double money) {
        System.out.printf("Withdrawing %f from PayPal\n", money);
    }
}
