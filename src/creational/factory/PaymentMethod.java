package creational.factory;

public abstract class PaymentMethod {
    private String cardNumber;
    private String cardHolder;
    private String cvv;
    private String expiryDate;

    public PaymentMethod(String cardNumber, String expiryDate, String cvv, String cardHolder) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.cardHolder = cardHolder;
    }

    public abstract void authorize();
    public abstract void calculatePaymentFees();
    public abstract void startMoneyTransfer();

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

}
