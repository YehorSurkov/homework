package lesson13;

public class PrintClassInfo {
    public static void main(String[] args) {
        printInfo(String.class);
        printInfo(LocaleInfo.class);
        printInfo(double.class);
        printInfo(int[].class);
    }

    public static void printInfo(Class obj) {
        System.out.println("Class name is " + obj.getName());
        System.out.println("This class is primitive. That's " + obj.isPrimitive());
        System.out.println("This object is array. That's " + obj.isArray());
        System.out.println("This class has following methods: " + obj.getMethods() + '\n');
    }
}
