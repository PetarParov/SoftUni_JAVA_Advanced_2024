package MultidimensionalArraysExercises;

import java.util.Scanner;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");
        int n = Integer.parseInt(tokens[0]);
        String type = tokens[1];

        int[][] matrix = new int[n][n];

        if (type.equals("A")) {
            fillMatrixTypeA(matrix);
        } else {
            fillMatrixTypeB(matrix);
        }

        printMatrix(n, matrix);

    }

    private static void printMatrix(int n, int[][] matrix) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixTypeB(int[][] matrix) {
        int value = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = value++;
                }
            } else {
                for (int row = matrix.length-1; row >= 0; row--) {
                    matrix[row][col] = value++;
                }
            }
        }
    }

    private static void fillMatrixTypeA(int[][] matrix) {
        int value = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = value++;
            }
        }
    }
}