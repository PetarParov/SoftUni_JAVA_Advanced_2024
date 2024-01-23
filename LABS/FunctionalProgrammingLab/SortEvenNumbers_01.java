package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(num -> num%2 != 0);

        String spaceSeparatedNumbers = numbers.stream()
                .map(i -> i.toString())
                .collect(Collectors.joining(", "));

        System.out.println(spaceSeparatedNumbers);

        List<Integer> numbers2 = Arrays.stream(spaceSeparatedNumbers.split(",\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers2.sort(Integer::compareTo);

        String spaceSeparatedNumbers2 = numbers2.stream()
                .map(i -> i.toString())
                .collect(Collectors.joining(", "));

        System.out.println(spaceSeparatedNumbers2);

    }

}
