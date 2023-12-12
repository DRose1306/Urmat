package task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class One {
    public static void main(String[] args) {

    }

    //void printMap(Map<String, String> map) { } Вывести все ключи и значения
    public static void mapOutput(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
        }
    }

    //Set<String> findKeysByValue(Map<String, String> map, String value) { } Найти ключи, значения которых равны заданной строке.
    public static Set<String> keyEqualsValue(Map<String, String> map, String value) {
        Set<String> result = new HashSet<>();
        for (String element : map.keySet()) {
            if (element.equals(value)) {
                result.add(element);
            }
        }
        return result;
    }

    //Map<String, String> mergeMapsIfUniqueKeys(Map<String, String> map1, Map<String, String> map2) {}Объединить две мапы, если у них нет одинаковых ключей.
    public static Map<String, String> mergeMapsIfUniqueKeys(Map<String, String> map1, Map<String, String> map2) {
        Map<String, String> mergeMap = new HashMap<>(map1);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (!mergeMap.containsKey(entry.getKey())) {
                mergeMap.put(entry.getKey(), entry.getValue());
            }
        }
        return mergeMap;
    }

    //Map<String, String> invertMap(Map<String, String> map) {}Инвертировать мапу (ключи становятся значениями и наоборот).
    public static Map<String, String> invertMap(Map<String, String> map) {
        Map<String, String> newMap = new HashMap<>();
        for (Map.Entry<String, String> element : map.entrySet()) {
            newMap.put(element.getValue(), element.getKey());
        }
        return newMap;
    }

    //int countUniqueValues(Map<String, String> map) {}Найти количество уникальных значений в мапе
    public static int countUniqueValues(Map<String, String> map) {
        Set<String> set = new HashSet<>(map.values());
        return set.size();
    }

    //Set<String> findAllValues(Set<Map<Integer, String>> setOfMaps) {}Вывести все строки, которые являются значениями в любой из мап.
    public static Set<String> findAllValues(Set<Map<Integer, String>> setOfMaps) {
        Set<String> set = new HashSet<>();
        for (Map<Integer, String> element : setOfMaps) {
            for (Map.Entry<Integer, String> entry : element.entrySet()) {
                set.add(entry.getValue());
            }
        }
        return set;
    }

    //int sumAllKeys(Set<Map<Integer, String>> setOfMaps) {}Найти сумму всех ключей всех мап.
    public static int sumAllKeys(Set<Map<Integer, String>> setOfMaps) {
        int sum = 0;
        for (Map<Integer, String> element : setOfMaps) {
            for (Integer entry : element.keySet()) {
                sum += entry;
            }
        }
        return sum;
    }

    //boolean containsValue(Set<Map<Integer, String>> setOfMaps, String value) {}Определить, содержится ли заданная строка как значение хотя бы в одной из мапы.
    public static boolean containsValue(Set<Map<Integer, String>> setOfMaps, String value) {

        for (Map<Integer, String> element : setOfMaps) {
            for (String entry : element.values()) {
                if (value.equals(entry)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Set<String> findAllStringsWithChar(Set<Map<Character, Set<String>>> complexSet, char c) {}Найти все строки, которые начинаются с заданного символа во всех вложенных сетах.
    public static Set<String> findAllStringsWithChar(Set<Map<Character, Set<String>>> complexSet, char c) {
        Set<String> set = new HashSet<>();
        for (Map<Character, Set<String>> element : complexSet) {
            for (Set<String> entry : element.values()) {
                for (String str : entry) {
                    if (str.charAt(0) == c) {
                        set.add(str);
                    }
                }
            }
        }
        return set;
    }

    //Map<Character, Integer> countStringOccurrences(Set<Map<Character, Set<String>>> complexSet) {
    //}Создать мапу, где ключами являются символы, а значениями - количество раз, которое
    //строки начинающиеся на этот символ встречаются во всех вложенных сетах.
    public static Map<Character, Integer> countStringOccurrences(Set<Map<Character, Set<String>>> complexSet) {
        Map<Character, Integer> newMap = new HashMap<>();
        for (Map<Character, Set<String>> element : complexSet) {
            for (Map.Entry<Character, Set<String>> entry : element.entrySet()) {
                int count = 0;
                for (String str : entry.getValue()) {
                    if (str.charAt(0) == entry.getKey()) {
                        count++;
                    }
                }
                newMap.put(entry.getKey(), count);
            }
        }
        return newMap;

    }
}
