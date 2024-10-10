package behavioral.strategy;

public class Product {

    private String name;
    private double price;
    PricingStrategy pricingStrategy;

    public Product(){}

    public Product(String name, double price, PricingStrategy pricingStrategy) {
        this.name = name;
        this.price = price;
        this.pricingStrategy = pricingStrategy;
    }

    public String getName() {
        return name;
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public double getPrice() {
        return price;
    }

    public double calculatePrice(){
        return pricingStrategy.calculatePrice(price);
    }
}
