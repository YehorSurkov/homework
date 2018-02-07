package lesson14;

import java.util.Objects;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class Query {
        public void printQuery() {
            System.out.printf("User {login %s, password %s} sent a query.\n", login, password);
        }
    }

    public void createQuery() {
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
        User that = (User) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
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
        User user = new User("YehorSurkov", "YEHOR");

        Query q1 = user.new Query();
        q1.printQuery();

        Query q2 = new User("IhorD", "ID").new Query();
        q2.printQuery();
    }
}
