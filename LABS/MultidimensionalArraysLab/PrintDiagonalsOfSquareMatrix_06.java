package MultidimensionalArraysLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int rows = n;
        int cols = n;

        int [][] matrix = new int[rows][cols];

        for (int i=0; i<rows; i++) {
            String line = scanner.nextLine();
            matrix[i] = Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        List<String> firstDiagonal = new ArrayList<>();
        List<String> secondDiagonal = new ArrayList<>();

        int diagonalPosition = 0;
        int secondRowCounter = n-1;

        for (int row = 0; row < matrix.length; row++) {
            firstDiagonal.add(matrix[row][diagonalPosition]+"");
            secondDiagonal.add(matrix[secondRowCounter][diagonalPosition]+"");
            diagonalPosition++;
            secondRowCounter--;
        }

        System.out.println(String.join(" ", firstDiagonal));
        System.out.println(String.join(" ", secondDiagonal));
    }
}