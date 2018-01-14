package lesson8.Zoo;

public class Dog extends Animal {
    private double lengthOfFangs;

    public Dog(String food, String location, double lengthOfFangs) {
        super(food, location);
        this.lengthOfFangs = lengthOfFangs;
    }

    public double getLengthOfFangs() {
        return lengthOfFangs;
    }

    public void setLengthOfFangs(double lengthOfFangs) {
        this.lengthOfFangs = lengthOfFangs;
    }

    public void makeNoise() {
        System.out.println("Bow-Wow");
    }
}
