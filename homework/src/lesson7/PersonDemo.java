package lesson7;

public class PersonDemo {
    public static void main(String[] args) {
        Person im = new Person();
        Person ihor = new Person("Ihor", 23);

        im.tell();
        ihor.tell();
        im.move();
        ihor.move();
    }
}
