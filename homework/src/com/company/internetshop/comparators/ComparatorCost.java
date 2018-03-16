package com.company.internetshop.comparators;

import com.company.internetshop.Product;

import java.util.Comparator;

public class ComparatorCost implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getCost() - o2.getCost() > 0) {
            return 1;
        } else if (o1.getCost() - o2.getCost() == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
