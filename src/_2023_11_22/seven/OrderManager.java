package _2023_11_22.seven;

import java.util.List;

public class OrderManager {
    // Класс OrderManager:
    //Поля: List<Order> pendingOrders, Kitchen kitchen, DeliveryService deliveryService.
    //Методы для управления заказами.
    private List<Order> pendingOrders;
    private Kitchen kitchen;

    @Override
    public String toString() {
        return "OrderManager{" +
                "pendingOrders=" + pendingOrders +
                ", kitchen=" + kitchen +
                ", deliveryService=" + deliveryService +
                '}';
    }

    public List<Order> getPendingOrders() {
        return pendingOrders;
    }

    public void setPendingOrders(List<Order> pendingOrders) {
        this.pendingOrders = pendingOrders;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public DeliveryService getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public OrderManager(List<Order> pendingOrders, Kitchen kitchen, DeliveryService deliveryService) {
        this.pendingOrders = pendingOrders;
        this.kitchen = kitchen;
        this.deliveryService = deliveryService;
    }

    private DeliveryService deliveryService;

}
