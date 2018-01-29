package lesson10.clothes;

/**
 * Created by Student on 24.01.2018.
 */
public class Skirt extends Clothes implements WomanClothes {

    public Skirt(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("I'm dressing a skirt");
    }

    @Override
    public Sizes getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(Sizes size) {
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
}
