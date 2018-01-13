package lesson8.bouquet;

public class Flower {
    static private int cntr;
    private String country;
    private double validity;
    private double cost;

    public Flower(String country, double validity, double cost) {
        this.country = country;
        this.validity = validity;
        this.cost = cost;
        cntr++;
    }

    public static int getCntr() {
        return cntr;
    }

    public static void setCntr(int cntr) {
        Flower.cntr = cntr;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getValidity() {
        return validity;
    }

    public void setValidity(double validity) {
        this.validity = validity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
