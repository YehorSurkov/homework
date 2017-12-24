package lesson2;

/**
 * This is the homework number 2.
 * Comments and literals in Java.
 * This is Doc Comment in Task#1.
 */
public class HomeWork2 {
    public static void main(String[] args) {
        //This function sets a different literals and shows them.
        boolean litBoolean = true;
        System.out.println(litBoolean);

        String litStr = "This is my second Java program\u003A\u0029\nProgramming will be fun\u002C if I use Java!";
        System.out.println(litStr);

        char litChar = '\u2622';
        System.out.println(litChar);

        byte litByte01 = 0b01;
        System.out.println(litByte01);

        int litIntOct = 011;
        System.out.println(litIntOct);

        int litIntDec = 32;
        System.out.println(litIntDec);

        long litLongHex = 0xA958E9C;
        System.out.println(litLongHex);

        float litFl1 = 1.5f, litFl2 = 10.1f;
        System.out.println(litFl1);
        System.out.println(litFl2);

        double litDouble = 0.00001d;
        System.out.println(litDouble);
    }
}
