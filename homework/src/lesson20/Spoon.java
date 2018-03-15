package lesson20;

import java.util.Objects;

public class Spoon {
    private boolean taken;

    public Spoon() {
        taken = false;
    }

    public synchronized boolean isTaken() {
        return taken;
    }

    public synchronized void setTaken(boolean taken) {
        this.taken = taken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spoon spoon = (Spoon) o;
        return taken == spoon.taken;
    }

    @Override
    public int hashCode() {

        return Objects.hash(taken);
    }
}
