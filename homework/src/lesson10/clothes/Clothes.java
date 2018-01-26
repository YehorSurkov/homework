package lesson10.clothes;

/**
 * Created by Student on 24.01.2018.
 */
public abstract class Clothes {
    private int size;
    private double cost;
    private String color;

    public Clothes(int size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
