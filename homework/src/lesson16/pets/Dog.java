package lesson16.pets;

import java.util.Objects;

public class Dog extends Pet {
    private String kind;

    public Dog(String name, int age, String kind) {
        super(name, age);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(kind, dog.kind);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), kind);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "kind='" + kind + '\'' +
                '}';
    }

    public void speek() {
        System.out.println("Bow-Wow!");
    }
}
