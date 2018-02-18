package lesson16.pets;

import java.util.Objects;

public class Parrot extends Pet {
    private String origin;

    public Parrot(String name, int age, String origin) {
        super(name, age);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(origin, parrot.origin);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), origin);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "origin='" + origin + '\'' +
                '}';
    }

    public void speak() {
        System.out.println("Piastry! Piastry!");
    }
}
