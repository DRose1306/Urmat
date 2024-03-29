package Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        int[] array = {3, 1, 7, 9, 9, 5};

        System.out.println(findLargestNum(array));
        System.out.println(findLargestNum2(array));

        int[] stations = {0, 200, 375, 550, 750, 950};
        System.out.println(minStops(stations, 400));
    }

    //задача по определению наибольшего числа, которое можно составить из массива.
    private static String findLargestNum(int[] array) {
        String result = "";

        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i];
        }

        return result;
    }

    private static String findLargestNum2(int[] array) {
        return String.join("", Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).map(String::valueOf).toArray(String[]::new));
    }

    //задача по определению минимального количества остановок
    private static int minStops(int[] stations, int capacity) {
        int result = 0;
        int currentStop = 0;

        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;
            while (nextStop < stations.length - 1 && stations[nextStop + 1] - stations[currentStop] <= capacity)
                nextStop++;

            if (currentStop == nextStop)
                return -1;

            if (nextStop < stations.length - 1)
                result++;

            currentStop = nextStop;
        }
        return result;
    }
}
