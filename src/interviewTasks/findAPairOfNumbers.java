package interviewTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findAPairOfNumbers {
    // дан на вход массив и искомое число, следует найти пару чисел из массива, которые в сумме дают данное число.
    public static void main(String[] args) {
        int[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int target = 4;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(twoSum(array, target)));
        System.out.println(Arrays.toString(twoSum2(array, target)));
        System.out.println(Arrays.toString(twoSum3(array, target)));
        System.out.println(Arrays.toString(twoSum4(array, target)));
    }

    // time complexity O(n^2) space complexity O(1)
    private static int[] twoSum(int[] array, int k) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == k) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[0];
    }

    // time complexity O(n) space complexity O(n)
    private static int[] twoSum2(int[] array, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int numberToFind = k - array[i];
            if (set.contains(numberToFind)) {
                return new int[]{numberToFind, array[i]};
            }
            set.add(array[i]);
        }
        return new int[0];
    }

    // time complexity O(n log n) space complexity O(1)
    private static int[] twoSum3(int[] array, int k) {
        for (int i = 0; i < array.length; i++) {
            int numberToFind = k - array[i];
            int l = i + 1, r = array.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (array[mid] == numberToFind) {
                    return new int[]{array[i], array[mid]};
                }
                if (numberToFind < array[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return new int[0];
    }

    // time complexity O(n) space complexity O(1)
    private static int[] twoSum4(int[] array, int k) {
        int l = 0, r = array.length - 1;
        while (l < r) {
            int sum = array[l] + array[r];
            if (sum == k) {
                return new int[]{array[l], array[r]};
            }
            if (sum < k) {
                l++;
            } else {
                r--;
            }
        }
        return new int[0];
    }
}
