package behavioral.strategy;

public class VisaCardPayment implements PaymentStrategy{

    @Override
    public void processPayment(double money) {
        System.out.printf("Withdrawing %f from Visa Card\n", money);
    }
}
