package lesson14;

interface Printable {
    void print();
}

public class AnonymDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Print");
            }
        };
        printable.print();
    }
}
