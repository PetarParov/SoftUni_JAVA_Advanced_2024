package DefiningClassesLab.CarInfo01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String data = scanner.nextLine();
            String brand = data.split(" ")[0];
            String model = data.split(" ")[1];
            int hp = Integer.parseInt(data.split(" ")[2]);

            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(hp);

            System.out.println(car);

        }
    }
}
