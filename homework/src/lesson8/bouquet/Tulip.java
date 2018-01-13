package lesson8.bouquet;

public class Tulip extends Flower {
    private String color;

    public Tulip(String color, String country, double validity, double cost) {
        super(country, validity, cost);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
