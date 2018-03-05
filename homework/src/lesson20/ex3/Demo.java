package lesson20.ex3;

public class Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a");

        MyClass mc1 = new MyClass(sb);
        MyClass mc2 = new MyClass(sb);
        MyClass mc3 = new MyClass(sb);

        mc1.start();
        mc2.start();
        mc3.start();
    }
}
