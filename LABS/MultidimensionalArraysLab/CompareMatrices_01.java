package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] inputOne = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = inputOne[0];
        int columns = inputOne[1];

        int[][] arraysOne = new int[rows][columns];

        for (int r = 0; r < arraysOne.length; r++) {
            arraysOne[r] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[] inputTwo = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows2 = inputTwo[0];
        int columns2 = inputTwo[1];

        int[][] arraysTwo = new int[rows2][columns2];

        for (int r = 0; r < arraysTwo.length; r++) {
            arraysTwo[r] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        boolean isEqual = equal(arraysOne, arraysTwo);

        if (isEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


    }
    public static boolean equal (int[][] first, int[][] second) {
        boolean equal = true;
        if (first.length == second.length) {
            for (int r = 0; r < first.length; r++) {
                if (first[r].length == second[r].length) {
                    for (int c = 0; c < first[r].length; c++) {
                        if (first[r][c] != second[r][c]) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return equal;
    }
}