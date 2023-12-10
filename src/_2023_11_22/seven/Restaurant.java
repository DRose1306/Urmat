package _2023_11_22.seven;

import java.util.HashMap;
import java.util.List;

public class Restaurant {
    // Класс Restaurant:
    //Поля: String name, Menu menu, List<Order> orders, HashMap<Integer, Customer> customers.
    //Методы для управления рестораном и его базовыми функциями.
    private String name;
    private Menu menu;

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", menu=" + menu +
                ", orders=" + orders +
                ", customers=" + customers +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public HashMap<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(HashMap<Integer, Customer> customers) {
        this.customers = customers;
    }

    public Restaurant(String name, Menu menu, List<Order> orders, HashMap<Integer, Customer> customers) {
        this.name = name;
        this.menu = menu;
        this.orders = orders;
        this.customers = customers;
    }

    private List<Order> orders;
    private HashMap<Integer, Customer> customers;

}
