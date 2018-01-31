package lesson12;

import java.util.Formatter;

public class StudentFormatDemo {
    public static void main(String[] args) {
        String name = "Yehor Surkov";
        int mark = 4;
        String subject = "chemistry";

        method1(name, mark, subject);
        method2(name, mark, subject);
    }

    public static void method2(String name, int mark, String subject) {
        System.out.printf("Student %s got %d mark on %s.", name, mark, subject);
    }

    public static void method1(String name, int mark, String subject) {
        Formatter f = new Formatter();
        f.format("Student %s got %d mark on %s.", name, mark, subject);
        System.out.println(f);
    }
}
