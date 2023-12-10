package _2023_11_22.seven;

import java.util.List;

public class DeliveryPerson implements Deliveerable {
    //Класс DeliveryPerson:
    //Поля: String name, String vehicleType, boolean isAvailable, List<Order> currentDeliveries.
    //Реализация интерфейса Deliverable.
    private String name;
    private String vehicleType;
    private boolean isAvailable;

    @Override
    public String toString() {
        return "DeliveryPerson{" +
                "name='" + name + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", isAvailable=" + isAvailable +
                ", currentDeliveries=" + currentDeliveries +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<Order> getCurrentDeliveries() {
        return currentDeliveries;
    }

    public void setCurrentDeliveries(List<Order> currentDeliveries) {
        this.currentDeliveries = currentDeliveries;
    }

    public DeliveryPerson(String name, String vehicleType, boolean isAvailable, List<Order> currentDeliveries) {
        this.name = name;
        this.vehicleType = vehicleType;
        this.isAvailable = isAvailable;
        this.currentDeliveries = currentDeliveries;
    }

    private List<Order> currentDeliveries;

    @Override
    public void startDelivery(Order order) {

    }

    @Override
    public void completeDelivery(Order order) {

    }
}
