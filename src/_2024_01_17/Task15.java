package _2024_01_17;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task15 {
    public static void main(String[] args) {
//Напишите метод, который анализирует данные из нескольких различных коллекций,
//соединяет их и выводит результаты, соответствующие определённым критериям.

        Product2 product1 = new Product2("Electronics", 1500.0);
        Product2 product2 = new Product2("Clothing", 200.0);

        List<Product2> products1 = List.of(product1, product2);

        Product2 product3 = new Product2("Electronics", 1200.0);
        Product2 product4 = new Product2("Groceries", 50.0);

        List<Product2> products2 = List.of(product3, product4);

        Order2 order1 = new Order2("Customer1", products1);
        Order2 order2 = new Order2("Customer2", products2);

        List<Order2> orders = List.of(order1, order2);

        System.out.println(highValueProductsByCustomer(orders, 1260.0));
    }

    static Map<String, List<String>> highValueProductsByCustomer(List<Order2> orders, double threshold) {

        return orders.stream()
                .filter(order -> order.getProducts().stream().mapToDouble(Product2::getPrice).sum() > threshold)
                .collect(Collectors.toMap(Order2::getCustomerName,
                        order -> order.getProducts().stream().map(Product2::getCategory).collect(Collectors.toList())));
    }
}

class Product2 {
    private String category;
    private double price;

    public Product2(String category, double price) {
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

class Order2 {
    private String customerName;
    private List<Product2> products;

    public Order2(String customerName, List<Product2> products) {
        this.customerName = customerName;
        this.products = products;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Product2> getProducts() {
        return products;
    }
}