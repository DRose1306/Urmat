package _2024_02_07.task;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Найдите все вхождения чисел
 * с плавающей точкой (с десятичной точкой) в строке.
 */
public class FloatingPointNumbers {
    public static List<String> findFloatingPointNumbers(String input) {
        List<String> number = new ArrayList<>();

        String regex = "\\b\\d+(\\.\\d+)?\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            number.add(matcher.group());
        }
        return number;
    }

    public static void main(String[] args) {
        String text = "The price is $10.99, and the weight is 3.5 kg.";
        List<String> floatingPointNumbers = findFloatingPointNumbers(text);
        for (String number : floatingPointNumbers) {
            System.out.println(number);
        }
    }
}
