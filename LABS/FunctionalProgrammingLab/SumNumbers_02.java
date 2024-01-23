package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(",\\s+");

        Function<String, Integer> func = Integer::parseInt;

        List<Integer> listNumbers = Arrays.stream(numbers)
                .map(func)
                .collect(Collectors.toList());

        System.out.println("Count = " + listNumbers.size());
        int sum = listNumbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum = " + sum);
    }
}