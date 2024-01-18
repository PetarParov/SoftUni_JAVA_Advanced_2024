package SetsAndMapsAdvancedExercises;

import java.util.Scanner;

public class FixEmails_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!"stop".equals(command)) {
            String name = command;
            String email = scanner.nextLine();

            String[] elements = email.split("\\.");

            String domain = elements[elements.length - 1];

            if (!"com".equals(domain) && !"uk".equals(domain) && !"us".equals(domain)) {
                System.out.printf("%s -> %s%n", name, email);
            }

            command = scanner.nextLine();
        }

    }
}
