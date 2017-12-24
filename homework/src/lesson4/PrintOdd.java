package lesson4;

public class PrintOdd {
    public static void main(String[] args) {
        if (ifOdd(Integer.parseInt(args[0]))) {
            System.out.println(Integer.parseInt(args[0]));
        } else {
            System.out.println("Even");
        }
    }

    public static boolean ifOdd(int i) {
        if ((i & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }
}
