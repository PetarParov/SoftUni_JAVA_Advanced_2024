package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[n][];

        for (int i = 0; i < n; i++) {
            int[] row = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = row;
        }
        String[] coordinates = scan.nextLine().split(" ");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);

        int wrongValue = matrix[x][y];
        int[][] resultMatrix = new int[n][];

        for (int i = 0; i < n; i++) {
            resultMatrix[i] = matrix[i].clone();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (resultMatrix[i][j] == wrongValue) {
                    resultMatrix[i][j] = getSum(matrix, i, j, wrongValue);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getSum(int[][] inputMatrix, int row, int col, int wrongValue) {
        int sum = 0;

        if (row - 1 >= 0 && inputMatrix[row - 1][col] != wrongValue) {
            sum += inputMatrix[row - 1][col];
        }
        if (row + 1 < inputMatrix.length && inputMatrix[row + 1][col] != wrongValue) {
            sum += inputMatrix[row + 1][col];
        }
        if (col - 1 >= 0 && inputMatrix[row][col - 1] != wrongValue) {
            sum += inputMatrix[row][col - 1];
        }
        if (col + 1 < inputMatrix[row].length && inputMatrix[row][col + 1] != wrongValue) {
            sum += inputMatrix[row][col + 1];
        }
        return sum;
    }
}