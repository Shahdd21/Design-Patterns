package creational.factory;

public class PaymentProcessor {
    private final PaymentMethodFactory paymentMethodFactory;

    public PaymentProcessor(PaymentMethodFactory paymentMethodFactory) {
        this.paymentMethodFactory = paymentMethodFactory;
    }

    public void processPayment(CardType cardType, String cardNumber, String cardHolder, String cvv, String expiryDate){

        PaymentMethod paymentMethod = paymentMethodFactory.createPaymentMethod(cardType, cardNumber, cardHolder,cvv,expiryDate);

        paymentMethod.authorize();
        paymentMethod.startMoneyTransfer();
        paymentMethod.calculatePaymentFees();
    }
}
