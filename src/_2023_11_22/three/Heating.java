package _2023_11_22.three;

import java.util.Random;
import java.util.Scanner;

public class Heating extends Device {
    //3.3. Класс Heating:
    //Наследуется от Device.
    //Дополнительные поля: double currentTemperature, double targetTemperature.
    //Методы для управления отоплением.

    private double currentTemperature;
    private double targetTemperature;

    public static double changeTemperature(double currentTemperature, double targetTemperature) {
        Random rnd = new Random();
        currentTemperature = rnd.nextDouble(10, 35);

        System.out.println("текущая температура в доме составляет " + currentTemperature + " градусов");
        System.out.println("желаете изменить температуру?");
        String antwort = new Scanner(System.in).nextLine();

        if (antwort.equalsIgnoreCase("да")) {
            System.out.println("Введите желаюмую температуру");
            targetTemperature = new Scanner(System.in).nextDouble();

            if (targetTemperature > currentTemperature){
                System.out.println("Повышение температуры до желаемой");
                while (currentTemperature < targetTemperature){
                    currentTemperature++;
                }
                System.out.println("текущая температура в доме составляет" + currentTemperature + " градусов");
            }else{
                System.out.println("Понижание температуры до желаемой");
                while (currentTemperature > targetTemperature){
                    currentTemperature--;
                }
                System.out.println("текущая температура в доме составляет" + currentTemperature + " градусов");

            }

        }else System.out.println("оставляем тукущий уровень температуры в доме");

        return currentTemperature;
    }

    @Override
    void lastCheckTime() {

    }

    @Override
    void isOn() {

    }
}
