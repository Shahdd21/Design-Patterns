package behavioral.strategy;

public class BankTransferPayment implements PaymentStrategy{
    @Override
    public void processPayment(double money) {
        System.out.printf("Withdrawing %f from your Bank account\n", money);
    }
}
