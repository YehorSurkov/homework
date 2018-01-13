package lesson8.bouquet;

public class Cactus extends Flower {
    private boolean thorn;

    public Cactus(boolean thorn, String country, double validity, double cost) {
        super(country, validity, cost);
        this.thorn = thorn;
    }

    public void setThorn(boolean thorn) {
        this.thorn = thorn;
    }

    public void isThorn() {
        if (thorn) {
            System.out.println("Caution! This cactus has thorns");
        } else {
            System.out.println("This type of cactus has no thorn");
        }
    }
}
