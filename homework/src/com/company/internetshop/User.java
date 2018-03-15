package com.company.internetshop;


import java.util.Objects;
import java.util.List;

public class User {
    private String login;
    private String password;
    private List<Product> basket;

    public User(String name, String password) {
        this.login = name;
        this.password = password;
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


}
