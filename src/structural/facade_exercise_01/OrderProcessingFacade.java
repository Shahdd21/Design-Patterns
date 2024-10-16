package structural.facade_exercise_01;

public class OrderProcessingFacade {
    private PaymentProcessing paymentProcessing;
    private ShippingLogistics shippingLogistics;
    private InventoryManagement inventoryManagement;

    public OrderProcessingFacade() {
        this.paymentProcessing = new PaymentProcessing();
        this.shippingLogistics = new ShippingLogistics();
        this.inventoryManagement = new InventoryManagement();
    }

    public void makeOrder(Order order){
        inventoryManagement.checkOrderAvailability(order);
        paymentProcessing.processPayment(order);
        shippingLogistics.ship(order);
    }
}
