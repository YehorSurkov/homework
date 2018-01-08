package lesson7;

public class Person {
    String fullName;
    int age;

    void move() {
        System.out.println(fullName + " speaks smth.");
    }

    void tell() {
        System.out.println(fullName + " speaks smth.");
    }

    Person() {
        fullName = "Yehor Surkov";
        age = 23;
    }

    Person(String name, int age) {
        fullName = name;
        this.age = age;
    }
}
