package structural.facade_exercise_01;

public class ShippingLogistics {

    public void ship(Order order){
        System.out.println("Shipping order: "+ order.getName());
    }
}
