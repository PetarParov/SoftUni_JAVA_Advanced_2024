package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map <String, String> phoneBook = new LinkedHashMap<>();

        while (!"search".equals(line)) {
            String[] elements = line.split("-");

            String name = elements[0];
            String number = elements[1];

            if (phoneBook.isEmpty()){
                phoneBook.put(name, number);
            } else if (!phoneBook.containsKey(name)){
                phoneBook.put(name, number);
            } else {
                phoneBook.get(name).equals(number);
            }
            line = scanner.nextLine();
        }

        String newName = scanner.nextLine();

        while (!"stop".equals(newName)) {
            if (phoneBook.containsKey(newName)){
                System.out.printf ("%s -> %s%n", newName, phoneBook.get(newName));
            } else {
                System.out.printf("Contact %s does not exist.%n", newName);
            }

            newName = scanner.nextLine();
        }

    }
}
