package _2023_11_20.two.transportFleet;

import java.util.Arrays;
import java.util.Scanner;

public class Fleet {
    //Транспортный Парк (Fleet)
    //                Поля: название, адрес, список менеджеров парка (массив).
    //                Методы: добавить менеджера, поиск менеджера по имени.
    private String name;
    private String addres;
    private String[] managersList;

    public static String[] addManager(String[] managersList) {
        System.out.println("Введите имя нового менеджера");

        String newManager = new Scanner(System.in).nextLine();
        System.out.println("Имя нового менеджера " + newManager);

        System.out.println("Добавляем нового менеджера");

        String[] newManagerList = new String[managersList.length + 1];
        for (int i = 0; i < managersList.length; i++) {
            newManagerList[i] = managersList[i];
        }
        newManagerList[managersList.length] = newManager;

        System.out.println("Книга в списке доступных");
        System.out.println(Arrays.toString(newManagerList));
        return newManagerList;
    }

    public static void searchForManager(String managerName, String[] managersList) {
        for (String manager : managersList) {
            if (managerName.equals(manager)) {
                System.out.println("Менеджер по имени " + managerName + " найден");
            } else System.out.println("данное имя отсутствует в списке");
        }
    }
}
