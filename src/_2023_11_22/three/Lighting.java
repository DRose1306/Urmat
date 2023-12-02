package _2023_11_22.three;

import java.util.Random;
import java.util.Scanner;

public class Lighting extends Device {
    //3.2. Класс Lighting:
    //Наследуется от Device.
    //Дополнительные поля: int brightnessLevel, String colorTemperature.
    //Методы для управления освещением.

    private int brightnessLevel;
    private String colorTemperature;

    public static int changeBrihtnessLevel(int brightnessLevel){
        Random rnd = new Random();
        int level = rnd.nextInt(1,100);

        System.out.println("Текущий уровень освещения " + level);
        System.out.println("Хотите поменять уровень света?");
        String antwort = new Scanner(System.in).nextLine();

        String whatToDo = (antwort.equalsIgnoreCase("да"))? "Уменьшить или увеличить?" : "Оставляем текущий уровень света";
        System.out.println(whatToDo);

        String antwort2 = new Scanner(System.in).nextLine();

        if (antwort2.equalsIgnoreCase("Уменьшить")){
            System.out.println("Уменьшаем уровень света");
            level--;
        }else{
            System.out.println("Увеличиваем уровень света");
            level++;
        }

        level = brightnessLevel;
        return brightnessLevel;
    }

    @Override
    void lastCheckTime() {

    }

    @Override
    void isOn() {

    }
}
