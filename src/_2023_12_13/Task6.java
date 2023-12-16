package _2023_12_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //- Создайте Map<String, String>, добавьте в него несколько пар ключ-значение,
        //  затем найдите определенный ключ и замените его значение.

        Map<String, String> map = new HashMap<>();
        map.put("A", "C");
        map.put("B", "D");
        System.out.println("Old Map: " +map);

        System.out.println("Введите искомый ключ");
        String key = new Scanner(System.in).nextLine();
        System.out.println("Введите новое значение для данного ключа");
        String value = new Scanner(System.in).nextLine();

        System.out.println("New Map: " + changeValue(map, key, value));
    }

    public static Map<String, String> changeValue(Map<String, String> map, String key, String value) {
        for (Map.Entry<String, String> element : map.entrySet()){
            if (key.equalsIgnoreCase(element.getKey())){
                element.setValue(value);
            }
        }
        return map;
    }
}
