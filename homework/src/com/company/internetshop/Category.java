package com.company.internetshop;

import lesson16.collections.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Category {
    private String name;
    private List<lesson16.collections.Product> setOfProducts;

    public Category(String name, List<Product> setOfProducts) {
        this.name = name;
        this.setOfProducts = setOfProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getSetOfProducts() {
        return setOfProducts;
    }

    public void setSetOfProducts(ArrayList<Product> setOfProducts) {
        this.setOfProducts = setOfProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        lesson16.collections.Category category = (lesson16.collections.Category) o;
        return Objects.equals(name, category.getName()) &&
                Objects.equals(setOfProducts, category.getSetOfProducts());
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, setOfProducts);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", setOfProducts=" + setOfProducts +
                '}';
    }

    public void printSortedByName() {
        setOfProducts.sort(new ComparatorName());
        setOfProducts.forEach(System.out::println);
    }

    public void printSortedByCost() {
        setOfProducts.sort(new ComparatorCost());
        setOfProducts.forEach(System.out::println);
    }

    public void printSortedByRank() {
        setOfProducts.sort(new ComparatorRank());
        setOfProducts.forEach(System.out::println);
    }

    public void printSortedByNameInverse() {
        setOfProducts.sort(new ComparatorName());
        Collections.reverse(setOfProducts);
        setOfProducts.forEach(System.out::println);
    }

    public void printSortedByCostInverse() {
        setOfProducts.sort(new ComparatorCost());
        Collections.reverse(setOfProducts);
        setOfProducts.forEach(System.out::println);
    }

    public void printSortedByRankInverse() {
        setOfProducts.sort(new ComparatorRank());
        Collections.reverse(setOfProducts);
        setOfProducts.forEach(System.out::println);
    }
}
