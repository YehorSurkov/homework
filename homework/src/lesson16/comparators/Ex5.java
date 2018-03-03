package lesson16.comparators;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        List<Product> arrClothes = new ArrayList<>();
        arrClothes.add(new Product("skirt", 3.1, 2));
        arrClothes.add(new Product("dress", 23.1, 3));
        arrClothes.add(new Product("chinos", 13.1, 6));
        arrClothes.add(new Product("short", 5.6, 5));
        arrClothes.add(new Product("shoes", 11.7, 11));
        arrClothes.add(new Product("coat", 10.1, 8));

        Category clothes = new Category("Clothes", arrClothes);
        System.out.println("Sorted by Cost");
        clothes.printSortedByCost();
        System.out.println("\nSorted by Name");
        clothes.printSortedByName();
        System.out.println("\nSorted by Rank");
        clothes.printSortedByRank();
    }
}
