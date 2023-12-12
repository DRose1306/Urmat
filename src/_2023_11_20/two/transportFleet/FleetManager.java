package _2023_11_20.two.transportFleet;

import java.util.Arrays;
import java.util.Scanner;

public class FleetManager extends Driver{
    //Менеджер Парка (FleetManager)
    //        Поля: имя, список автомобилей (массив), список водителей (массив).
    //                Методы: добавить автомобиль в парк, назначить автомобиль водителю.

    protected String ManagerName;
    private String[] carList;
    private String[] driverList;

    public static String[] addCar(String[] carList){
        System.out.println("Введите название добавляемого авто");
        String car = new Scanner(System.in).nextLine();


        System.out.println("Заносим авто в список");

        String[] newCarList = new String[carList.length + 1];
        for (int i = 0; i < carList.length; i++) {
            newCarList[i] = carList[i];
        }
        newCarList[carList.length] = car;

        System.out.println("Авто добавлено в список");
        System.out.println(Arrays.toString(newCarList));

        return newCarList;
    }


    public static String getCar(String currentCar) {

        return currentCar;
    }
}
