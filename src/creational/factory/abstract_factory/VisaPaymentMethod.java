package creational.factory.abstract_factory;

import creational.factory.PaymentMethod;

public class VisaPaymentMethod extends InternationalPaymentMethod {
    public VisaPaymentMethod(String cardNumber, String expiryDate, String cvv, String cardHolder) {
        super(cardNumber, expiryDate, cvv, cardHolder);
    }

    @Override
    public void authorize() {
        System.out.println("Authorizing visa card....");
    }

    @Override
    public void calculatePaymentFees() {
        System.out.println("calculating payment fees for visa card....");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("starting money transfer for that visa card....");
    }
}
