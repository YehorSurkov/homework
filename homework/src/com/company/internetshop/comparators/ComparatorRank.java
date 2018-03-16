package com.company.internetshop.comparators;

import com.company.internetshop.Product;

import java.util.Comparator;

public class ComparatorRank implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getRank() - o2.getRank();
    }
}
