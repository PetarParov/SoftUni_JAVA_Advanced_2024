package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);


        int [] dimentions = Arrays.stream (scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimentions[0];
        int cols = dimentions[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
                int [] array = Arrays.stream (scanner.nextLine()
                                .split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                matrix [i] = array;
        }

        int num = Integer.parseInt(scanner.nextLine());

        // Create a boolean variable to indicate whether the number is found or not
        boolean found = false;

        // Loop through the matrix to find the positions of the number
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If the number is found, print its position and set found to true
                if (matrix[i][j] == num) {
                    System.out.println(i + " " + j);
                    found = true;
                }
            }
        }

        // If the number is not found, print "not found"
        if (!found) {
            System.out.println("not found");
        }

    }
}