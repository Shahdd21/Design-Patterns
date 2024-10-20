package creational.factory.abstract_factory;

import creational.factory.PaymentMethod;

public class MasterCardPaymentMethod extends InternationalPaymentMethod {
    public MasterCardPaymentMethod(String cardNumber, String expiryDate, String cvv, String cardHolder) {
        super(cardNumber, expiryDate, cvv, cardHolder);
    }

    @Override
    public void authorize() {
        System.out.println("Authorizing mastercard....");
    }

    @Override
    public void calculatePaymentFees() {
        System.out.println("calculating payment fees for mastercard....");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("starting money transfer for that mastercard....");
    }
}
