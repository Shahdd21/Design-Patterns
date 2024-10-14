package structural.bridge_exercise;

public class BasicLoyaltyProgram implements LoyaltyProgram{
    @Override
    public double calculatePrice(double price) {
        return price * 0.9 ;
    }
}
