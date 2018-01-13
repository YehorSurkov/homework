package lesson8;

import lesson8.com.company.professions.Driver;

public class Person extends Driver {
    private String fullName;
    private int age;

    public Person() {
        super("Yehor", "Surkov", 0);
        fullName = getFirstName() + " " + getLastName();
        age = 23;
    }

    public Person(String firstName, String lastName, int age, int exp) {
        super(firstName, lastName, exp);
        fullName = firstName + " " + lastName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void move() {
        System.out.println(fullName + " speaks smth.");
    }

    void tell() {
        System.out.println(fullName + " speaks smth.");
    }

}
