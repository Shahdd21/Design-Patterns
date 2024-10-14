package structural.bridge_exercise;

public class FlightProvider {
    private String name;
    private LoyaltyProgram loyaltyProgram;

    public FlightProvider(String name, LoyaltyProgram loyaltyProgram) {
        this.name = name;
        this.loyaltyProgram = loyaltyProgram;
    }

    public String getName() {
        return name;
    }

    public LoyaltyProgram getLoyaltyProgram() {
        return loyaltyProgram;
    }

    public void calculatePrice(double price){
        double priceWithDiscount = loyaltyProgram.calculatePrice(price);

        System.out.printf("The price of %s Flight after discount is %.2f\n", name,priceWithDiscount);
    }
}
