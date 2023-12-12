package _2023_11_20.two.transportFleet;

public class Driver {
    //Водитель (Driver)
    //        Поля: имя, стаж вождения, текущий автомобиль (Car).
    //                Методы: назначить автомобиль, освободить автомобиль.

    private String name;
    private double drivingExperiance;
    private String currentCar;

    public static String getCar(String currentCar) {
        return currentCar; //не совсем понятна формултровка задания, нужно ли дополнительно создать массив автомобилей?
    }

    public static void releaseCar(String currentCar){
        System.out.println("авто более не закреплено за водителем"); // тут тоже не совсем понятно что требуется
    }
}
