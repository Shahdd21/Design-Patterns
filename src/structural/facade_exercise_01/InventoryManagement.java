package structural.facade_exercise_01;

public class InventoryManagement {

    public void checkOrderAvailability(Order order){
        System.out.println("Checking for availability of: "+ order.getName());
    }
}
