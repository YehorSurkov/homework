package lesson18.serialization;

import java.io.Serializable;
import java.util.Objects;

public class Parrot extends Animal implements Serializable {
    private String color;

    public Parrot(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(color, parrot.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "color='" + color + '\'' + "; " +
                "name='" + this.getName() + '\'' +
                '}';
    }
}
