package _2023_12_4;

import java.util.*;

public class Three {
    public static void main(String[] args) {
        ////HashMap<Integer, List<String>>: Для каждого ключа выведите все строки из соответствующего списка, которые начинаются с гласной буквы.

        Map<Integer, List<String>> newMap = new HashMap<>();
        newMap.put(12, new ArrayList<>(Arrays.asList("Hello", "Mom", "Anna")));
        newMap.put(1, new ArrayList<>(Arrays.asList("Ulo", "Uno", "Gym")));
        newMap.put(7, new ArrayList<>(Arrays.asList("Tut", "Home", "Eee")));
        searchByFirstChar(newMap);

    }

    public static boolean checkByFirstChar(String str) {
        List<Character> characterList = new ArrayList<>(Arrays.asList('E', 'U', 'I', 'O', 'A', 'e', 'u', 'i', 'o', 'a'));
        return characterList.contains(str.charAt(0));
    }

    public static void searchByFirstChar(Map<Integer, List<String>> newMap) {
        for (Map.Entry<Integer, List<String>> element : newMap.entrySet()) {
            System.out.print("Key " + element.getKey() + " : ");
            for (String str : element.getValue()) {
                if (checkByFirstChar(str)) {
                    System.out.print(str + " ");
                }
            }
            System.out.println();
        }
    }
}
