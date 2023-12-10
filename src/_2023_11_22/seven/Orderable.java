package _2023_11_22.seven;

import java.util.List;

public interface Orderable {
    // Интерфейс Orderable:
    //Методы: placeOrder(List<MenuItem> items), c, updateOrder(int orderId, List<MenuItem> newItems).
    void placeOrder(List<MenuItem> items);

    void updateOrder(int orderId, List<MenuItem> newItems);


}
