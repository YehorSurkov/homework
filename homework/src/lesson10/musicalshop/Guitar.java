package lesson10.musicalshop;

import java.util.Objects;

public class Guitar implements Instrument {
    private int numberOfString;

    public Guitar(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    public int getNumberOfString() {

        return numberOfString;
    }

    public void setNumberOfString(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return Objects.equals(numberOfString, guitar.numberOfString);
    }

    @Override
    public int hashCode() {

        return Objects.hash(numberOfString);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfString='" + numberOfString + '\'' +
                '}';
    }

    @Override
    public void play() {
        System.out.println(toString() + "is playing now");
    }
}
