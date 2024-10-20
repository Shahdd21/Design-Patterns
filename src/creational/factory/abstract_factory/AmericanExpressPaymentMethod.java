package creational.factory.abstract_factory;

import creational.factory.PaymentMethod;

public class AmericanExpressPaymentMethod extends InternationalPaymentMethod {
    public AmericanExpressPaymentMethod(String cardNumber, String expiryDate, String cvv, String cardHolder) {
        super(cardNumber, expiryDate, cvv, cardHolder);
    }

    @Override
    public void authorize() {
        System.out.println("Authorizing american express card....");
    }

    @Override
    public void calculatePaymentFees() {
        System.out.println("calculating payment fees for american express card....");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("starting money transfer for that american express card....");
    }
}
