package creational.factory;

public class MasterCardPaymentMethod extends PaymentMethod{
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
