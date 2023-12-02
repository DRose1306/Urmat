package _2023_11_22.three;

import java.time.LocalDateTime;
import java.util.Arrays;

public class SmartHome {
    //3.1. Класс SmartHome:
    //Поля: String homeName, Device[] devices, boolean isAwayMode, LocalDateTime lastUpdate.
    //Методы для управления домом в целом.
    private String homeName;
    private Device[] devices;
    private boolean isAwayMode;
    private LocalDateTime lastUpdate;

    public static void homeControl(String homeName, Device[] devices, LocalDateTime lastUpdate){
        int deviceQuantity = devices.length - 1;
        System.out.println("Добро пожаловать в систему управления SmartHome");
        System.out.println("Номер вашего дома " + homeName);
        System.out.println("В системе находятся " + deviceQuantity + " устройств");
        System.out.println(Arrays.deepToString(devices));
        System.out.println("Последнее обновление системы было произведено в " + lastUpdate);
        System.out.println("Желаете ввести изменения?");
    }
}
