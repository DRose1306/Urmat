package _2024_03_13;

import java.util.ArrayList;
import java.util.List;

public class TaskFour {

    private static int[] closestSum(int[] array, int k) {
        int n = array.length;
        // Массив для хранения наилучшей суммы
        int[] dp = new int[k + 1];
        // Массив для хранения чисел, дающих наилучшую сумму
        List<Integer>[] numbers = new ArrayList[k + 1];
        for (int i = 0; i <= k; i++) {
            numbers[i] = new ArrayList<>();
        }

        // Заполняем массивы dp и numbers
        for (int i = 0; i < n; i++) {
            for (int j = k; j >= array[i]; j--) {
                if (dp[j - array[i]] + array[i] >= dp[j]) {
                    dp[j] = dp[j - array[i]] + array[i];
                    numbers[j].clear();
                    numbers[j].addAll(numbers[j - array[i]]);
                    numbers[j].add(array[i]);
                }
            }
        }

        // Находим сумму, наиболее близкую к k
        int closestSum = 0;
        for (int i = 0; i <= k; i++) {
            if (Math.abs(dp[i] - k) < Math.abs(closestSum - k)) {
                closestSum = dp[i];
            }
        }

        return numbers[closestSum].stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 6, 7, 10};
        int k = 14;

        int[] result = closestSum(array, k);

        System.out.println("Числа, дающие сумму, наиболее близкую к " + k + ":");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
