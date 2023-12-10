package _2023_11_22.seven;

import java.util.List;

public class DeliveryService {
    // Класс DeliveryService:
    //Поля: List<DeliveryPerson> deliveryPeople, List<Order> deliveryQueue, boolean isOperational.
    //Методы для управления доставкой.
    private List<DeliveryPerson> deliveryPeople;
    private List<Order> deliveryQueue;

    @Override
    public String toString() {
        return "DeliveryService{" +
                "deliveryPeople=" + deliveryPeople +
                ", deliveryQueue=" + deliveryQueue +
                ", isOperational=" + isOperational +
                '}';
    }

    public List<DeliveryPerson> getDeliveryPeople() {
        return deliveryPeople;
    }

    public void setDeliveryPeople(List<DeliveryPerson> deliveryPeople) {
        this.deliveryPeople = deliveryPeople;
    }

    public List<Order> getDeliveryQueue() {
        return deliveryQueue;
    }

    public void setDeliveryQueue(List<Order> deliveryQueue) {
        this.deliveryQueue = deliveryQueue;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    public DeliveryService(List<DeliveryPerson> deliveryPeople, List<Order> deliveryQueue, boolean isOperational) {
        this.deliveryPeople = deliveryPeople;
        this.deliveryQueue = deliveryQueue;
        this.isOperational = isOperational;
    }

    private boolean isOperational;
}
