package structural.bridge_exercise;

public class PremimumLoyaltyProgram implements LoyaltyProgram{
    @Override
    public double calculatePrice(double price) {
        return price * 0.7 ;
    }
}
