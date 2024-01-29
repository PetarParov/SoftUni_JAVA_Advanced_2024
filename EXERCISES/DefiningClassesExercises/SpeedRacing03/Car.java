package DefiningClassesExercises.SpeedRacing03;

public class Car {

    private String model;
    private double fuelAmount;
    private double fuelCostFor1km;
    private double distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostFor1km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1km = fuelCostFor1km;
        this.distanceTraveled = 0;
    }

    public boolean canMove(double distance) {
        double fuelNeeded = distance * this.fuelCostFor1km;
        if (fuelNeeded <= this.fuelAmount) {
            this.fuelAmount -= fuelNeeded;
            this.distanceTraveled += distance;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f", this.model, this.fuelAmount, this.distanceTraveled);
    }
}