package com.company.internetshop;


import java.io.*;
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
        this.basket = new Basket();
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
        basket.putIn(product);
    }

    public double getCost() {
        return basket.getTotalCost();
    }

    //path = "src\\io\\internetShopReport.txt"
    public void printReport(String path) throws IOException {
        if (basket != null) {
            Writer writer = new FileWriter(path);
            writer.write(new SimpleDateFormat("yyyy-MM-dd HH:MM").format(Calendar.getInstance().getTime()));
            writer.write(System.lineSeparator());
            writer.write(login);
            writer.write(System.lineSeparator());
            for (Product product : basket.getBasket()) {
                writer.write(product.toString());
                writer.write(System.lineSeparator());
            }
            writer.close();
        }
    }

    //outputPass or inputPass = "src\\io\\serialized_basket.txt"
    public boolean serializeBasket(String outputPass) {
        try (
                ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(outputPass));
        ) {
            os.writeObject(basket);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Object deserialize(String inputPath) {
        Object obj = null;
        try (FileInputStream fis = new FileInputStream(inputPath);
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            obj = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
