package com.company.internetshop;

import lesson16.collections.Product;

import java.util.Comparator;

public class ComparatorName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
