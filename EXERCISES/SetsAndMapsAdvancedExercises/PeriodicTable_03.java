package SetsAndMapsAdvancedExercises;

import java.util.*;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String [] elementsArray = scanner.nextLine().split("\\s+");
            elements.addAll(Arrays.asList(elementsArray));
        }

        for (String el : elements){
            System.out.print(el + " ");
        }
    }
}
