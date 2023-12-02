package _2023_11_22.two;

import java.util.Random;

public class Tram  extends Vehicle implements Maintenance{
    //3.4. Класс Tram:
    //Наследуется от Vehicle.
    //Дополнительные поля: int trackWidth, boolean electric.
    //Реализация специфических методов для трамвая.

    private int trackWidth;
    private boolean electric;

    public static void tramStopped(){
        System.out.println("трамвай остановился на остановке");
        System.out.println("трамвай высадил и набрал новых пассажиров");
    }

    public static void tramStartedMoving(){
        System.out.println("трамвай тронулся с места");
        System.out.println("трамвай следуя маршруту, едет к следующей остановке");
    }

    @Override
    void fareAcceptance() {

    }

    @Override
    void onRoute() {

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
            System.out.println("ТС отремонтирован и готов к эксплуатации");
        }else {
            System.out.println("ТС на ремонте");
        }
    }

    @Override
    public void commissioning() {
        Random rnd = new Random();
        boolean accessibility = rnd.nextBoolean();
        if (accessibility = true){
            System.out.println("ТС отдан в эксплуатацию");
        }else System.out.println("ТС не готов к сдаче в эксплуатацию");
    }
}
