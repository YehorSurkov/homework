package com.company.internetshop;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String name, String password) {
        this.login = name;
        this.password = password;
    }

    public User(String name) {
        this.login = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String name) {
        this.login = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void addToBasket(Product product) {
        if(basket == null) {
            basket = new Basket();
        }
            basket.putIn(product);
    }

    public double getCost() {
        return basket.getTotalCost();
    }

    //path = "src\\io\\internetShopReport.txt"
    public void printReport(String path) throws IOException {
        if (basket != null) {
            Writer writer = new FileWriter(path);
            writer.write(new SimpleDateFormat("yyyy-MM-dd HH:MM:SS").format(Calendar.getInstance().getTime()) + '\n');
            writer.write(login + '\n');
            for (Product product : basket.getBasket()) {
                writer.write(product.toString() + '\n');
            }
        }
    }
}
