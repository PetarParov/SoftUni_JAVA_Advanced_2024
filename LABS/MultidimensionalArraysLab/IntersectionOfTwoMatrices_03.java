package MultidimensionalArraysLab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readCharMatrix(scanner, rows);
        char[][] secondMatrix = readCharMatrix(scanner, rows);
        char [][] answer = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    answer[row][col] = firstMatrix[row][col];
                } else {
                    answer[row][col] = '*';
                }
            }
        }

        for (int row = 0; row < answer.length; row++) {
            for (int col = 0; col < answer[row].length; col++) {
                System.out.print(answer[row][col] + " ");
            }
            System.out.println();
        }

    }

    private static char[][] readCharMatrix(Scanner scanner, int rows) {

        char[][] matrix = new char[rows][];

        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String stripString = line.replaceAll("\\s+", "");
            matrix[row] = stripString.toCharArray();
        }
        return matrix;
    }
}