package otherTask;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {

        int[] seating = arrangeSeating();
        System.out.println("Optimal seating arrangement: " + Arrays.toString(seating));
    }

    public static int[] arrangeSeating() {
        // Размер стойки
        int totalSeats = 25;

        // Массив для хранения рассадки интровертов
        int[] seatingArrangement = new int[totalSeats];

        // Первый гость садится на стул №9
        seatingArrangement[8] = 1;

        // Второй гость садится на последний свободный стул
        seatingArrangement[totalSeats - 1] = 2;

        // Рассадка остальных гостей
        int currentGuest = 3;
        int middleIndex = totalSeats / 2;

        // Заполняем стулья в обе стороны от уже занятых
        for (int i = 1; i <= middleIndex; i++) {
            if (seatingArrangement[middleIndex - i] == 0) {
                seatingArrangement[middleIndex - i] = currentGuest++;
            }
            if (seatingArrangement[middleIndex + i] == 0) {
                seatingArrangement[middleIndex + i] = currentGuest++;
            }
        }

        return seatingArrangement;
    }
}

