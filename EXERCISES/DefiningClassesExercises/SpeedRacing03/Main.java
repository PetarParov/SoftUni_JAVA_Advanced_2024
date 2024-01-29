package DefiningClassesExercises.SpeedRacing03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            String model = carInfo[0];
            double fuelAmount = Double.parseDouble(carInfo[1]);
            double fuelCostFor1km = Double.parseDouble(carInfo[2]);
            Car car = new Car(model, fuelAmount, fuelCostFor1km);
            cars.put(model, car);
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandArgs = command.split("\\s+");
            String carModel = commandArgs[1];
            double distance = Double.parseDouble(commandArgs[2]);
            Car car = cars.get(carModel);
            if (car.canMove(distance)) {
                cars.put(carModel, car);
            } else {
                System.out.println("Insufficient fuel for the drive");
            }
            command = scanner.nextLine();
        }
        for (Car car : cars.values()) {
            System.out.println(car);
        }
    }
}