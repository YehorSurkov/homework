package com.company.internetshop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Shop {

    public static void main(String[] args) throws IOException {
        Map<String, String> users = new TreeMap<>();
        users.put("Yehor", "1234567890");
        signUp(users, "Nastya", "0987654321");
        signUp(users, "Ihor", "13579");
        signUp(users, "Ihor", "13579");
        signUp(users, "Nastya", "XXXXX");

        List<Product> clothes = new ArrayList<>();
        clothes.add(new Product("skirt", 3.1, 2));
        clothes.add(new Product("dress", 23.1, 3));
        clothes.add(new Product("chinos", 13.1, 6));
        clothes.add(new Product("short", 5.6, 5));
        clothes.add(new Product("shoes", 11.7, 11));
        clothes.add(new Product("coat", 10.1, 8));

        Category category = new Category("clothes", clothes);
        category.printSortedByCost();
        System.out.println();
        category.printSortedByName();
        System.out.println();
        category.printSortedByRankInverse();
        System.out.println();

        User user1 = signIn(users, "Nastya", "0987654321");
        System.out.println(user1.getLogin());
        User user2 = signIn(users, "Ihor", "XXXX");

        user1.addToBasket(category.getSetOfProducts().get(2));
        user1.addToBasket(category.getSetOfProducts().get(3));
        System.out.println(user1.getCost());
        user1.printReport("src\\io\\internetShopReport.txt");
    }

    public static User signIn(Map<String, String> users, String login, String password) {
        if (users.containsKey(login) && users.get(login) == password) {
            System.out.println("Authenticated!");
            return new User(login, password);
        } else {
            System.out.println("Access denied");
            return null;
        }
    }

    public static boolean signUp(Map<String, String> users, String login, String password) {
        if (!users.containsKey(login)) {
            users.put(login, password);
            return true;
        } else {
            System.out.println("Please, choose another login");
            return false;
        }
    }
}
