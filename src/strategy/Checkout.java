package strategy;

public class Checkout {

    private PaymentStrategy paymentStrategy;

    public Checkout() {}

    public Checkout(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void processPayment(double money){
        paymentStrategy.processPayment(money);
    }
}
