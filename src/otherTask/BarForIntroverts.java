package otherTask;

import java.util.Arrays;

public class BarForIntroverts {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        int[] seats = allocationOfSeats(10);
        int[] seats2 = allocationOfSeats(11);

        System.out.println(Arrays.toString(seats));
        System.out.println(Arrays.toString(seats2));


    }

    private static int[] allocationOfSeats(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Количество мест должно быть положительным числом");
        }

        int[] seats = new int[n / 2 + n % 2];


        // for (int i = 1; i < n / 2 + n % 2; i++)
        seats[0] = 1;

         if (n % 2 == 0) {
            seats[1] = n - 1;
            seats[2] = n / 2;
            seats[3] = (n - 1) / 3;
            seats[4] = n - 3;

        } else {
            seats[1] = n;
            seats[2] = n / 2;
            seats[3] = n / 3;
            seats[4] = n - 4;
            seats[5] = n - 2;

        }

        return seats;
    }
}
