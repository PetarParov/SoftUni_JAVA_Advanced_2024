package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimElements = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimElements [0];
        int cols = dimElements [1];
        int sumElements = 0;

        int [][] matrix = new int[rows][cols];

        for (int i=0; i<rows; i++) {
            String line = scanner.nextLine();
            matrix[i] = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sumElements += matrix[row][col];
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sumElements);


    }
}
