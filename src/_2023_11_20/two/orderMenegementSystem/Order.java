package _2023_11_20.two.orderMenegementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Order {
    //  Заказ (Order)
    //        Поля: список товаров (массив), статус заказа, общая сумма.
    //                Методы: добавить товар в заказ, рассчитать общую сумму.

    private String[] listOfGoods;
    protected String orderStatus;
    private double orderSum;

    public static void addProduct(String[] listOfGoods){
        System.out.println("Введите название добавляемого продукта");

        String product= new Scanner(System.in).nextLine();
        System.out.println("Желаемый продукт " + product);

        System.out.println("Заносим продукт в список заказа");

        String[] newlistofGoods = new String[listOfGoods.length + 1];
        for (int i = 0; i < listOfGoods.length; i++) {
            newlistofGoods[i] = listOfGoods[i];
        }
        newlistofGoods[listOfGoods.length] = product;

        System.out.println("Продукт добавлен в заказ");
        System.out.println(Arrays.toString(newlistofGoods));
    }

    public static void calculateSum(double orderSum){
        //знал бы хеш таблицы, у каждого продукта была бы цена. И этот метод был бы краше.
        System.out.println("Сумма заказа состовляет " + orderSum + " южноафриканских Рэнд");
    }
}
