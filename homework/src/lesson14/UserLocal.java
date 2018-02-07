package lesson14;

import java.util.Objects;

public class UserLocal {
    private String login;
    private String password;

    public UserLocal(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void printQuery() {
                System.out.printf("User {login %s, password %s} sent a query.\n", login, password);
            }
        }

        Query q = new Query();
        q.printQuery();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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
        UserLocal userLocal = (UserLocal) o;
        return Objects.equals(login, userLocal.login) &&
                Objects.equals(password, userLocal.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        UserLocal user = new UserLocal("YehorSurkov", "YEHOR");

        user.createQuery();
    }
}
