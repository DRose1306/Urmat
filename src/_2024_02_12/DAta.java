package _2024_02_12;

import java.util.List;

// Нарушение CODE SMELLS:
public class DAta { //имя класса написано не коректно Data должно быть
    public double calculateAverage(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.size();

        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - average, 2);
        }
        double standardDeviation = Math.sqrt(variance / numbers.size());

        return standardDeviation;
    }
    public double getAverage(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }
    public double getStandardDeviation(List<Double> numbers){
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        if (numbers.size() == 1) {
            return 0.0; // Если в списке только одно число, стандартное отклонение не имеет смысла.
        }

        double average = getAverage(numbers);

        double variance = 0;

        for (double num : numbers) {
            variance += Math.pow(num - average, 2);
        }

        return Math.sqrt(variance / numbers.size());
    }
}
