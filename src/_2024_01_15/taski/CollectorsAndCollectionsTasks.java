package _2024_01_15.taski;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectorsAndCollectionsTasks {

    public static void main(String[] args) {
        // Задача 1: Собрать элементы потока в список.
        List<Integer> list = Stream.of(1, 2, 3, 4, 1, 5, 6, 7, 8, 2, 3, 4)
                .toList();
        System.out.println("Integer List: " + list);
        System.out.println();

        // Задача 2: Удалить дубликаты из списка и собрать их в множество.
        List<Integer> list2 = list.stream()
                .distinct()
                .toList();

        System.out.println("List without дубликаты: " + list2);
        System.out.println();

        // или
        // Set<Integer> set = list.stream()
        //.collect(Collectors.toSet());

        // Задача 3: Группировка строк по длине.
        Map<Integer, List<String>> map = Stream.of("asdsa", "dvsvsdv", "ngng", "ngngn", "öoöolo")
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Map String String.length: " + map);
        System.out.println();


        // Задача 4: Подсчет повторяющихся элементов и создание мапа.
        Map<String, Long> map2 = Stream.of("asdsa", "dvsvsdv", "ngng", "ngngn", "öoöolo", "asdsa", "ngng")
                .collect(Collectors.groupingBy(el -> el, Collectors.counting()));
        System.out.println("Map String и повторение String " + map);
        System.out.println();


        // Задача 5: Собрать только уникальные элементы в список.
        Set<String> set2 = Stream.of("asdsa", "dvsvsdv", "ngng", "ngngn", "öoöolo", "asdsa", "ngng")
                .collect(Collectors.toSet());
        System.out.println("Set unique elements: " + set2);
        System.out.println();

        // Задача 6: Объединение элементов в строку с максимальной длиной.
        Optional<String> str = Stream.of("asdsa", "dvsvsdv", "ngng", "ngngn", "öoöolo", "asdsa", "ngng")
                .max(Comparator.comparingInt(String::length));
        System.out.println("Longest string: " + str);
        System.out.println();

        // Задача 7: Разбиение строки на символы и сбор их в множество.
        List<Character> collect = Stream.of("Sun", "set", "Sun", "shine")
                .flatMapToInt(String::chars)
                .mapToObj(el -> (char) el)
                .collect(Collectors.toList());

        System.out.print("Strings as Characters: ");
        System.out.println(collect);
        System.out.println();


        // Задача 8: Построение кастомной мапы из элементов.
        Map<Character, Integer> integerMap = Stream.of('A', 'G', 'M', 'd', '?', 'E')
                .collect(Collectors.toMap(el -> el, el -> (int) el));
        System.out.println("Map from Charaters List: " + integerMap);

        // Задача 9: Подсчет суммы значений объектов.
        int sumOfUnicodesValues = Stream.of('A', 'G', 'M', 'd', '?', 'E')
                .mapToInt(el -> (int) el)
                .sum();
        System.out.println("sum of unicodes values: " + sumOfUnicodesValues);

        int sumOfStrings = Stream.of("ass", "fdffd", "a", "ftjzkz")
                .mapToInt(String::length)
                .sum();
        System.out.println("sum of String length: " + sumOfStrings);

        //ну и тд

        // Задача 10: Группировка по критерию и подсчет среднего.
        // Map<String,Integer> pupilMap = Stream.of(new Pupil("Urmat", generateList()), new Pupil("Dima", generateList()), new Pupil("Sava", generateList()), new Pupil("Slava", generateList()))
          //      .collect(Collectors.groupingBy(Pupil::getName, Collectors.averagingInt(Pupil::getMark)));
        //не работает или нужно создать метод в классе Pupil который будет давать это значение, либо лист оценок заменить на int оценку

        Map<String, Double> averageQuantityByName = Stream.of(
                        new Fruct("apple", 25),
                        new Fruct("orange", 30),
                        new Fruct("kiwi", 35),
                        new Fruct("kiwi", 15),
                        new Fruct("banana", 35))
                .collect(Collectors.groupingBy(Fruct::getName, Collectors.averagingInt(Fruct::getQuantity)));
        System.out.println("Группировка по критерию и подсчет среднего: " + averageQuantityByName);
    }
    static List<Integer> generateList(){
        final int from = 2;
        final int to = 5;

        return IntStream
                .range(from,to)
                .boxed()
                .collect(Collectors.toList());
    }

    static class Pupil {
        private String name;
        private List<Integer> mark;

        public Pupil(String name, List<Integer> mark) {
            this.name = name;
            this.mark = mark;
        }

        public String getName() {
            return name;
        }

        public List<Integer> getMark() {
            return mark;
        }
    }
    static class Fruct{
        String name;
        int quantity;

        public Fruct(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}