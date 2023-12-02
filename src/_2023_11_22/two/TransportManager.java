package _2023_11_22.two;

public class TransportManager implements TransportControl {
    //3.5. Класс TransportManager:
    //Поля: Vehicle[] vehicles, int totalVehicles, String managerName.
    //Реализация методов управления транспортными средствами.

    private Vehicle[] vehicles;
    private int totalVehicles;
    private String managerName;

    public static void vehicleControl(String managerName){
        System.out.println("Менеджер " + managerName + " приступил к смене");
        System.out.println("Менеджер " + managerName + " осуществляет контроль за транспортом согласно регламенту");
    }

    public static void vehicleControl(int totalVehicles){
        System.out.println("На маршруте находятся всего " + totalVehicles + " транспортных средств");

    }

    @Override
    public void vehicleRouteControl() {

    }

    @Override
    public void vehicleScheduleControl() {

    }
}
