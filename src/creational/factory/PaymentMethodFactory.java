package creational.factory;

public class PaymentMethodFactory {
    public PaymentMethod createPaymentMethod(CardType cardType,String cardNumber, String cardHolder, String cvv, String expiryDate){

        if(cardType == CardType.MASTER_CARD)
            return new MasterCardPaymentMethod(cardNumber, cardHolder,cvv,expiryDate);

        if(cardType == CardType.VISA)
            return new VisaPaymentMethod(cardNumber, cardHolder,cvv,expiryDate);

        if(cardType == CardType.AMERICAN_EXPRESS)
            return new AmericanExpressPaymentMethod(cardNumber, cardHolder,cvv,expiryDate);

        throw new UnsupportedOperationException("Unsupported Operation");

    }
}
