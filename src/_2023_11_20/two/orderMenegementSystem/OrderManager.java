package _2023_11_20.two.orderMenegementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class OrderManager {
    //Менеджер Заказов (OrderManager)
    //        Поля: список доступных товаров (массив), список заказов (массив).
    //                Методы: обработка нового заказа, обновление статуса заказа.

    protected String[] avaiableGoods;
    protected String[] listOfOrders;

    public static String[] addNewOrder(String[] listOfOrders){
        System.out.println("Введите номер нового заказа");
        String newOrder= new Scanner(System.in).nextLine();

        System.out.println("Заносим заках в список заказов");

        String[] newlistofOrders = new String[listOfOrders.length + 1];
        for (int i = 0; i < listOfOrders.length; i++) {
            newlistofOrders[i] = listOfOrders[i];
        }
        newlistofOrders[listOfOrders.length] = newOrder;

        System.out.println("Заказ добавлен в список");
        System.out.println(Arrays.toString(newlistofOrders));
        return newlistofOrders;
    }

    public static String orderStatusUpdate(String orderStatus){
        System.out.println("Статус заказа " + orderStatus);
        System.out.println("Заказ обработан");
        String newOrderStatus = "Заказ отправлен";
        System.out.println(newOrderStatus);
        return newOrderStatus;
    }
}
