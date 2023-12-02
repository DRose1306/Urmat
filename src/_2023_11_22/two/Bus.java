package _2023_11_22.two;

import java.util.Random;

public class Bus extends Vehicle implements Maintenance{
    //3.2. Класс Bus:
    //Наследуется от Vehicle.
    //Дополнительные поля: boolean accessibility, int busNumber.
    //Реализация специфических методов для автобуса.

    private boolean accessibility;
    private int nusNumber;

    public static void busStopped(){
        System.out.println("автобус остановился на остановке");
        System.out.println("автобус высадил и набрал новых пассажиров");
    }

    public static void busStartedMoving(){
        System.out.println("автобус тронулся с места");
        System.out.println("автобус следуя маршруту, едет к следующей остановке");
    }

    @Override
    void fareAcceptance() {
        System.out.println("проверка билетов");
    }

    @Override
    void onRoute() {
        System.out.println("автобус сдедует маршруту");
    }


    @Override
    public void vihicleCleaning() {
        System.out.println("По брибытию на депо, производятся мойка и уборка салона авобуса");
    }

    @Override
    public void checkVihicleCondition() {
        System.out.println("Раз в месяц производится плановая проверка ТС");
        System.out.println("В случае надобности производится ремонт ТС");
    }


    @Override
    public void vihicleRepair() {
        Random rnd = new Random();
        boolean isRepaired = rnd.nextBoolean();
        if (isRepaired = true){
            System.out.println("автобус отремонтирован и готов к эксплуатации");
        }else {
            System.out.println("автобус на ремонте");
        }
    }


    @Override
    public void commissioning() {
        Random rnd = new Random();
        boolean accessibility = rnd.nextBoolean();
        if (accessibility = true){
            System.out.println("автобус отдан в эксплуатацию");
        }else System.out.println("автобус не готов к сдаче в эксплуатацию");
    }
}
