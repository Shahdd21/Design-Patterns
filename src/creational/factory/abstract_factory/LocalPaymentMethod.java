package creational.factory.abstract_factory;

public abstract class LocalPaymentMethod implements PaymentMethod{

    private String cardNumber;
    private String cardHolder;
    private String cvv;
    private String expiryDate;

    public LocalPaymentMethod(String cardNumber, String expiryDate, String cvv, String cardHolder) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public abstract void authorize();

    @Override
    public abstract void startMoneyTransfer();

    @Override
    public abstract void calculatePaymentFees();
}
