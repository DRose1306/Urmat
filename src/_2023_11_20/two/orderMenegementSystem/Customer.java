package _2023_11_20.two.orderMenegementSystem;

import java.util.Random;
import java.util.Scanner;

public class Customer {
    //Клиент (Customer)
    //        Поля: имя, email, история заказов (массив).
    //                Методы: сделать заказ, отменить заказ.
    private String name;
    private String email;
    private String[] orders;

    public static void makeOrder() {
        Random rnd = new Random();
        int waitingTime = rnd.nextInt();
        int orderNum = rnd.nextInt();

        System.out.println("Введите заказ");
        String order = new Scanner(System.in).nextLine();

        System.out.println("Вы заказали " + order);
        System.out.println("Номер вашего заказа " + orderNum);
        System.out.println("Ваш заказ будет готов в течении " + waitingTime + " минут");
    }

    public static void orderCancellation(){
        System.out.println("Введите номер вашего заказа");
        int orderNum = new Scanner(System.in).nextInt();

        System.out.println("Заказ номер " + orderNum + " отменен");
    }

}
