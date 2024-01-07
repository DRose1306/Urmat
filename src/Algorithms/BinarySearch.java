package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 4));
        System.out.println(binarySearchRecursiv(array, 5, 0, array.length - 1));
    }

    public static int binarySearch(int[] array, int k) {
        int low = 0;
        int hight = array.length - 1;

        while (low < hight) {
            int middle = low + (hight - low) / 2;
            if (k < array[middle]) {
                hight = middle - 1;
            } else if (k > array[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int binarySearchRecursiv(int[] array, int key, int low, int high) {
        int middle = low + (high - low) / 2;
        
        if (low > high) {
            // не нашли элемента, который равен ключу
            return -1;
        }
        if (key == array[middle]) {
            // в случае, если элемент в центре равняется ключу (нашли элемент)
            return middle;
        } else if (key < array[middle]) {
            // рекурсивный вызов для левого подмассива
            // не забывайте здесь ключевое слово return (подумайте, зачем оно нужно)
            return binarySearchRecursiv(array, key, low, middle - 1);
        } else {
            // рекурсивный вызов для правого помассива
            return binarySearchRecursiv(array, key, middle + 1, high);
        }
    }
}
