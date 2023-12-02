package _2023_11_22.two;

import java.util.Random;

public class Taxi extends Vehicle implements Maintenance{
    //3.3. Класс Taxi:
    //Наследуется от Vehicle.
    //Дополнительные поля: String licensePlate, boolean available.
    //Реализация специфических методов для такси.

    private String licensePlate;
    private boolean available;

    public static boolean isAvailable(boolean available){
        Random rnd = new Random();
        int yesOrNo = rnd.nextInt(1,3);
        if (yesOrNo == 1){
            available = true;
        }else available = false;
        return available;
    }

    public static void taxiStartedMoving(){
        System.out.println("пассажир сел в такси");
        System.out.println("такси тронулось с места");
        System.out.println("такси следуя маршруту, едет к следующей цели");
    }

    @Override
    void fareAcceptance() {
        System.out.println("проверка оплаты");

    }

    @Override
    void onRoute() {
        System.out.println("такси сдедует маршруту");

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
            System.out.println("такси отремонтирован и готов к эксплуатации");
        }else {
            System.out.println("такси на ремонте");
        }
    }

    @Override
    public void commissioning() {
        Random rnd = new Random();
        boolean accessibility = rnd.nextBoolean();
        if (accessibility = true){
            System.out.println("такси отдан в эксплуатацию");
        }else System.out.println("такси не готов к сдаче в эксплуатацию");
    }
}
