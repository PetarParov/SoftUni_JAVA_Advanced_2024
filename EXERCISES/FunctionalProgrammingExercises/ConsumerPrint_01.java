package FunctionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        Consumer<String[]> printArray = array -> {
            for (String name : array) {
                System.out.println(name);
            }
        };

        printArray.accept(names);

    }
}