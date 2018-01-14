package lesson8.Zoo;

public class Cat extends Animal {
    private double lenOfPaws;

    public Cat(String food, String location, double lenOfPaws) {
        super(food, location);
        this.lenOfPaws = lenOfPaws;
    }

    public double getLenOfPaws() {
        return lenOfPaws;
    }

    public void setLenOfPaws(double lenOfPaws) {
        this.lenOfPaws = lenOfPaws;
    }

    public void makeNoise(){
        System.out.println("Meow");
    }
}
