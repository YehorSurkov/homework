package lesson7;

public class PersonDemo {
    public static void main(String[] args) {
        Person Im = new Person();
        Person Ihor = new Person("Ihor", 23);

        Im.tell();
        Ihor.tell();
    }
}
