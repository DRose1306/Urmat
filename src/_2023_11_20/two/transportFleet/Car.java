package _2023_11_20.two.transportFleet;

import java.util.Scanner;

public class Car {
    //Автомобиль (Car)
    //        Поля: марка, модель, год выпуска.
    //                Методы: вывод информации об автомобиле, проверка на техосмотр.

    private String mark;
    private String model;
    private int releaseYehr;

    public static void autoInfoOutput(String mark, String model, int releaseYehr){
        System.out.println("Авто марки " + mark + mark + releaseYehr + " года выпуска");
        System.out.println("Не бита не крашена))");
    }

    public static void technicalInspection(){
        System.out.println("Введите дату последнего ТО");
        int dateOfTI = new Scanner(System.in).nextInt();
        int currentYear = 2023;
        String verdict = (currentYear - dateOfTI) > 2? "Требуется пройти тех.осмотр" : "последнний тех.осмотр еще действителен";
        System.out.println(verdict);
    }
}
