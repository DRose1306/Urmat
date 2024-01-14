package _2024_01_10.Strings;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {


    }

    static List<String> toUpperCase(List<String> input) {
        List<String> list = input.stream()
                .map(String::toUpperCase)
                .toList();

        return list;
    }
}
