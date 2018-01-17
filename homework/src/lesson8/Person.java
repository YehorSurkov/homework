package lesson8;

import lesson8.com.company.professions.Driver;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
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
