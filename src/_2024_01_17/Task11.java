package _2024_01_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        //Обработка вложенных структур с условными фильтрами
        //Задание: Напишите метод, который обрабатывает вложенные структуры данных
        //(например мапы, содержащих списки), фильтрует элементы по условию и объединяет их в один список.

        List<Order> orders = Arrays.asList(
                new Order("Urmat", Arrays.asList(new Item("bag", 20.8),
                        new Item("shoes", 120.0),
                        new Item("t-shirt", 29.99))),
                new Order("Urmat", Arrays.asList(new Item("short", 49.99),
                        new Item("cap", 15.5),
                        new Item("socks", 16.99))),
                new Order("Kamila", Arrays.asList(new Item("blouse", 40.0),
                        new Item("shoes", 75.0),
                        new Item("T-shirt", 19.99)))
        );
        List<Item> itemsByCustomer = getItemsByCustomerName(orders, "Urmat");
        System.out.println(itemsByCustomer);

    }

    static List<Item> getItemsByCustomerName(List<Order> orders, String customerName) {
    return orders.stream()
            .filter(el-> el.getCustomerName().equals(customerName))
            .flatMap(el-> el.getItems().stream())
            .collect(Collectors.toList());
    }
}

class Order {
    private String customerName;
    private List<Item> items;

    public Order(String customerName, List<Item> items) {
        this.customerName = customerName;
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Item> getItems() {
        return items;
    }
}

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
