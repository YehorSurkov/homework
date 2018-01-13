package lesson8;

import lesson8.bouquet.Cartanation;
import lesson8.bouquet.Flower;
import lesson8.bouquet.Rose;
import lesson8.bouquet.Tulip;

public class BouquetDemo {
    public static void main(String[] args) {
        Flower flwr1 = new Rose("Red", "France", 7, 13.5);
        Flower flwr2 = new Rose("Red", "Spain", 7, 11.75);
        Flower flwr3 = new Rose("White", "Ukraine", 14, 20);
        Flower flwr4 = new Tulip("Red", "The Netherlands", 4, 10);
        Flower flwr5 = new Tulip("Queen of the Night", "The Netherlands", 4, 11);
        Flower flwr6 = new Tulip("Yellow", "The Netherlands", 5, 12);
        Flower flwr7 = new Cartanation("Red", "Ukraine", 30, 1);
        Flower flwr8 = new Cartanation("Yellow", "Ukraine", 30, 1.25);
        Flower flwr9 = new Cartanation("Orange", "Ukraine", 30, 1.5);

        Flower[] bqt1 = {flwr1, flwr3, flwr5};
        Flower[] bqt2 = {flwr7, flwr9,  flwr6};
        Flower[] bqt3 = {flwr2, flwr4, flwr8};

        System.out.println("Bouquet1 costs " + totalCost(bqt1) + " hrvns");
        System.out.println("Bouquet2 costs " + totalCost(bqt2) + " hrvns");
        System.out.println("Bouquet3 costs " + totalCost(bqt3) + " hrvns");
        System.out.println("We have sold " + Flower.getCntr() + " in total.");


    }

    public static double totalCost(Flower[] bqt) {
        double total = 0;
        for (Flower flwr : bqt) {
            total = total + flwr.getCost();
        }
        return total;
    }
}
