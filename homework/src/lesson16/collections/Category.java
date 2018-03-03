package lesson16.collections;

import java.util.*;

public class Category {
    private String name;
    private List<Product> setOfProducts;


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
        Category category = (Category) o;
        return Objects.equals(name, category.name) &&
                Objects.equals(setOfProducts, category.setOfProducts);
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
