package creational.factory.abstract_factory;

public class CarteBancairePaymentMethod extends LocalPaymentMethod{
    public CarteBancairePaymentMethod(String cardNumber, String expiryDate, String cvv, String cardHolder) {
        super(cardNumber, expiryDate, cvv, cardHolder);
    }

    @Override
    public void authorize() {
        System.out.println("Authorizing Carte Bancaire Card....");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("Transferring money to Carte Bancaire Card....");
    }

    @Override
    public void calculatePaymentFees() {
        System.out.println("Calculating payment fees for Carte Bancaire Card....");
    }
}
