package structural.composite_exercise;

public class Product implements ShoppingCartItems {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getTotalPrice(){
        return price;
    }
}
