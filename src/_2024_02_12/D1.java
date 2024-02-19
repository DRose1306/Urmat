package _2024_02_12;

import java.util.List;

public class D1 {
    public static void main(String[] args) {
    }

    public double calculateAverageValueForGivenList(List<Double> listOfNumbers) {
        double sumOfAllValues = 0;
        for (double currentValue : listOfNumbers) {
            sumOfAllValues += currentValue;
        }
        return sumOfAllValues / listOfNumbers.size();
    }

    public double getAverage(List<Double> numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }
}