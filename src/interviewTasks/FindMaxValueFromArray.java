package interviewTasks;

import java.util.Arrays;

import static org.apache.commons.lang3.math.NumberUtils.max;
import static org.apache.commons.lang3.math.NumberUtils.min;

public class FindMaxValueFromArray {
    //дан массив чисел, исползуя 4 основных мат операторов в произвольном порядке получить максимальное возможное число.
    public static void main(String[] args) {
        double[] array = {1, -3, 0.1, -5};
        System.out.println(findMax(array));
    }

    private static double findMax(double[] array) {
        if (array.length == 0) {
            return 0;
        }

        double tmpMin = array[0];
        double tmpMax = array[0];
        double[] mins = new double[4];
        double[] maxs = new double[4];

        for (int i = 0; i < array.length; i++) {
            mins[0] = tmpMin - array[i];
            maxs[0] = tmpMax - array[i];

            mins[1] = tmpMin + array[i];
            maxs[1] = tmpMax + array[i];

            mins[2] = tmpMin * array[i];
            maxs[2] = tmpMax * array[i];

            if (array[i] != 0) {
                mins[3] = tmpMin / array[i];
                maxs[3] = tmpMax / array[i];
            }

            tmpMax = Math.max(max(mins), max(maxs));
            tmpMin = Math.min(min(mins), min(maxs));
        }
        return tmpMax;
    }

    private static double max(double[] arr) {
        return Arrays.stream(arr).max().orElse(Double.MIN_VALUE);
    }

    private static double min(double[] arr) {
        return Arrays.stream(arr).min().orElse(Double.MAX_VALUE);
    }
}
