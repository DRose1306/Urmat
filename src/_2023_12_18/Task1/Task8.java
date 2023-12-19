package _2023_12_18.Task1;

import java.util.Arrays;

public class Task8 {
    //Создайте функциональный интерфейс MatrixProcessor с методом process, который принимает
    //двумерный массив (матрицу) целых чисел и выполняет над ним операцию.
    //Напишите метод, который принимает матрицу и MatrixProcessor, и выполняет операцию нахождения транспонированной матрицы.
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] tM = matrixOperation(matrix, matrix1 -> { //никак до сих пор не могу понять как это все поместить в одну строку
            int rows = matrix1.length;
            int columns = matrix1[0].length;
            int[][] newMatrix = new int[columns][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    newMatrix[j][i] = matrix1[i][j];
                }
            }
            return newMatrix;
        });

        System.out.println("Old Matrix:");
        printMatrix(matrix);

        System.out.println("New Matrix:");
        printMatrix(tM);
    }

    static int[][] matrixOperation(int[][] martrix, MatrixProcessor matrixProcessor) {
        return matrixProcessor.process(martrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

@FunctionalInterface
interface MatrixProcessor {
    int[][] process(int[][] matrix);
}
