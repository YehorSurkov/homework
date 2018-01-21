package lesson10.musicalshop;

import java.util.Objects;

public class Dram implements Instrument {
    private double size;

    public Dram(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dram dram = (Dram) o;
        return Double.compare(dram.size, size) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "Dram{" +
                "size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println(toString() + " is playing now");
    }
}
