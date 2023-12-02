package _2023_11_22.three;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecuritySystem extends Device{
    //3.4. Класс SecuritySystem:
    //Наследуется от Device.
    //Дополнительные поля: boolean isArmed, String[] accessCodes.
    //Реализация специфических функций безопасности.

    private boolean isArmed;
    private String[] accesCodes;

    public static void secyritySystem(boolean isArmed, String[] accesCodes){
        Random rnd = new Random();
        isArmed = rnd.nextBoolean();
        if (isArmed){
            System.out.println("Система безопастности активна");
        }else {
            System.out.println("Система безопастности не активна");
            System.out.println("Для активации введите код доступа");
            String code = new Scanner(System.in).nextLine();

            if (code.equalsIgnoreCase(Arrays.toString(accesCodes))){
                System.out.println("Доступ разрешен, система активирована");
            }else{
                System.out.println("Пароль неверный");
                System.out.println("Осталось 3 попытки до блокировки системы");
            }
        }
    }
    @Override
    void lastCheckTime() {

    }

    @Override
    void isOn() {

    }

}
