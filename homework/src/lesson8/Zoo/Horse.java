package lesson8.Zoo;

public class Horse extends Animal {
    private double maxSpeed;

    public Horse(String food, String location, double maxSpeed) {
        super(food, location);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void makeNoise() {
        System.out.println("Neigh-neigh");
    }
}
