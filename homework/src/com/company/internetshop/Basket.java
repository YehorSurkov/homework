package com.company.internetshop;

import java.io.*;
import java.util.*;

public class Basket implements Serializable {
    private ArrayList<Product> basket;

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Product> basket) {
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket1 = (Basket) o;
        return Objects.equals(basket, basket1.basket);
    }

    @Override
    public int hashCode() {

        return Objects.hash(basket);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket.toString() +
                '}';
    }

    public void putIn(Product product) {
        basket.add(product);
    }

    public double getTotalCost() {
        double cost = 0;
        Iterator<Product> it = basket.iterator();
        while (it.hasNext()) {
            cost += it.next().getCost();
        }
        return cost;
    }

    //outputPass or inputPass = "src\\io\\serialized_basket.txt"
    public boolean serializeBasket(String outputPass) {
        try (
                OutputStream fos = new FileOutputStream(outputPass);
                ObjectOutputStream os = new ObjectOutputStream(fos);
        ) {
            os.writeObject(basket);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Object deserialize(String inputPath) {
        Object obj = null;
        try (FileInputStream fis = new FileInputStream(inputPath);
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            obj = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

}
