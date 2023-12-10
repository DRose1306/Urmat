package _2023_11_22.seven;

public interface Deliveerable {
    //нтерфейс Deliverable:
    //Методы: startDelivery(Order order), completeDelivery(Order order).
    void startDelivery(Order order);
    void completeDelivery(Order order);
}
