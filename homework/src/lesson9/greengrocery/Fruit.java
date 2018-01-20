package lesson9.greengrocery;

import java.util.Objects;

public abstract class Fruit {
    static public int fruitCount = 0;
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
        fruitCount++;
    }

    public static int getFruitCount() {
        return fruitCount;
    }

    public static void setFruitCount(int fruitCount) {
        Fruit.fruitCount = fruitCount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.weight, weight) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }

    final void printManufacturer() {
        System.out.println("Made in Ukraine");
    }

    public abstract double cost();
}
