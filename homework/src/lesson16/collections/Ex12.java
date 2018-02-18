package lesson16.collections;

import java.util.ArrayList;

public class Ex12 {
    public static void main(String[] args) {
        ArrayList<Product> arrClothes = new ArrayList<>();
        arrClothes.add(new Product("skirt", 3.1, 2));
        arrClothes.add(new Product("dress", 23.1, 3));
        arrClothes.add(new Product("chinos", 13.1, 6));
        arrClothes.add(new Product("short", 5.6, 5));
        arrClothes.add(new Product("shoes", 11.7, 11));
        arrClothes.add(new Product("coat", 10.1, 8));

        Category clothes = new Category("Clothes", arrClothes);
        System.out.println("Sorted by Cost");
        clothes.printSortedByCost();
        System.out.println();
        clothes.printSortedByCostInverse();
        System.out.println("\n\nSorted by Name");
        clothes.printSortedByName();
        clothes.printSortedByNameInverse();
        System.out.println("\n\nSorted by Rank");
        clothes.printSortedByRank();
        System.out.println();
        clothes.printSortedByRankInverse();
    }
}
