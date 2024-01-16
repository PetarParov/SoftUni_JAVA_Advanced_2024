package SetsAndMapsAdvancedLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Set<String> parkingLot = new LinkedHashSet<>();

        while (!"END".equals(line)) {
            String[] tokens = line.split(", ");
            if (tokens[0].equals("IN")) {
                parkingLot.add(tokens[1]);
            } else if (tokens[0].equals("OUT")) {
                parkingLot.remove(tokens[1]);
            }
            line = scanner.nextLine();
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }
        for (String carNumber : parkingLot) {
            System.out.println(carNumber);
        }

    }
}
