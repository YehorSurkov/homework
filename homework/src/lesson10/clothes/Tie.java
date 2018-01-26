package lesson10.clothes;

/**
 * Created by Student on 24.01.2018.
 */
public class Tie extends Clothes implements ManClothes {
    public Tie(int size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(int size) {
        super.setSize(size);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(double cost) {
        super.setCost(cost);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void dressMan() {
        System.out.println("I'm dressing a tie.");
    }
}
