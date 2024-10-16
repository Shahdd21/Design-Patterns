package structural.facade_exercise_01;

public class PaymentProcessing {

    public void processPayment(Order order){
        System.out.printf("Processing payment of %s, price: %.2f\n", order.getName(), order.getPrice());
    }
}
