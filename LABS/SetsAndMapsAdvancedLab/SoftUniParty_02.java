package SetsAndMapsAdvancedLab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guestList = new TreeSet<>();
        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {
            guestList.add(input);
            input = scanner.nextLine();
        }

        while (!"END".equals(input = scanner.nextLine())) {
            guestList.remove(input);
        }

        System.out.println(guestList.size());
        for (String guest : guestList) {
            System.out.println(guest);
        }
    }
}