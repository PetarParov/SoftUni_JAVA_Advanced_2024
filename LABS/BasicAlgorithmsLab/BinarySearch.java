package BasicAlgorithmsLab;

import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {
    // Function to find the index of an element in a sorted array
    // Returns -1 if the element is not present
    public static int findIndex(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (key < array[mid]){
                end = mid - 1;
            } else if (key > array[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }

        return -1; // Element not found
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int [] sortedArray = Arrays
                      .stream(scanner.nextLine()
                              .split(" "))
                      .mapToInt(e -> Integer.parseInt(e))
                      .toArray();

        int targetElement  = Integer.parseInt(scanner.nextLine());

        int result = findIndex(sortedArray, targetElement);

        if (result != -1) {
            System.out.println(result);
        }

    }
}