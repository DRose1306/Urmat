package _2023_11_22.seven;

import java.util.List;

public class Order {
    //Класс Order:
    //Поля: int orderId, Customer customer, List<MenuItem> orderedItems, double totalCost.
    //Реализация интерфейса Orderable.
    private int orderId;
    private Customer customer;
    private List<MenuItem> orderedItems;

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", orderedItems=" + orderedItems +
                ", totalCost=" + totalCost +
                '}';
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<MenuItem> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(List<MenuItem> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Order(int orderId, Customer customer, List<MenuItem> orderedItems, double totalCost) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderedItems = orderedItems;
        this.totalCost = totalCost;
    }

    private double totalCost;
}
