package com.company.internetshop;

import java.io.*;
import java.util.*;

public class Basket implements Serializable {
    private List<Product> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public List<Product> getBasket() {
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
}
