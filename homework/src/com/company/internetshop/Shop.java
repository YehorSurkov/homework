package com.company.internetshop;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Shop {

    public static void main(String[] args) {
        Map<String, String> users = new TreeMap<>();
        users.put("Yehor", "1234567890");
        users.put("Nastya", "0987654321");
        users.put("Ihor", "13579");
        users.put("Den", "24680");
    }

    public static User authentification(Map<String, String> users, String login, String password) {
        if (users.containsKey(login) && users.containsValue(password)) {
            return new User(login, password);
        } else {
            System.out.println("Access denied");
            return null;
        }
    }
}
