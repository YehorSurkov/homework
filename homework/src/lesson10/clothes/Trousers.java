package lesson10.clothes;

/**
 * Created by Student on 24.01.2018.
 */
public class Trousers extends Clothes implements ManClothes, WomanClothes {
    public Trousers(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("I'm dressing trousers.");
    }

    @Override
    public void dressWoman() {
        System.out.println("I'm dressin trousers.");
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
