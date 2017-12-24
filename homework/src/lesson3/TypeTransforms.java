package lesson3;

/**
 * Homework 3. Point 2.
 * Presented below public class contains functions of types transforms.
 * Each function of transformation is presented in a new method.
 */

public class TypeTransforms {
    public static void main(String[] args) {
        // You should show what type do you want as output. Just uncomment proper one;
        // int yourChoise = 1; //If you want to transform values into byte
        // int yourChoise = 2; //If you want to transform values to short
        // int yourChoise = 3; //If you want to transform values to char
        // int yourChoise = 4; //if you want to transform values to int
        // int yourChoise = 5; //If you want to transform values to long
        // int yourChoise = 6; //If you want to transform values to float
        int yourChoise = 999; //Just for fun:)

        //Some values are proposed to test methods
        short sh = -15_000;
        char ch = '\u1369';
        int i = 21_123_321;
        long l = -2_123_456_987;
        float f = 0.25f;
        double d = 1.00000000038474834474851;

        if (yourChoise == 1) {
            System.out.println("Short to byte " + shortToByte(sh));
            System.out.println("Char to byte " + charToByte(ch));
            System.out.println("Int to byte " + intToByte(i));
            System.out.println("long to byte " + longToByte(l));
            System.out.println("float to byte " + floatToByte(f));
            System.out.println("double to byte " + doubleToByte(d));
        } else if (yourChoise == 2) {
            System.out.println("Char to short " + charToShort(ch));
            System.out.println("Int to short " + intToShort(i));
            System.out.println("long to short " + longToShort(l));
            System.out.println("float to short " + floatToShort(f));
            System.out.println("double to short " + doubleToShort(d));
        } else if (yourChoise == 4) {
            System.out.println("long to int " + longToInt(l));
            System.out.println("float to int " + floatToInt(f));
            System.out.println("double to int " + doubleToInt(d));
        } else if (yourChoise == 3) {
            System.out.println("int to char " + intToChar(i));
            System.out.println("long to char " + longToChar(l));
            System.out.println("float to char " + floatToChar(f));
            System.out.println("double to char " + doubleToChar(d));
        } else if (yourChoise == 5) {
            System.out.println("float to long " + floatToLong(f));
            System.out.println("double to long " + doubleToLong(d));
        } else if (yourChoise == 6) {
            System.out.println("double to float " + doubleToFloat(d));
        } else {
            System.out.println("Hey, it doesn't work in this way. Never do this again(");
        }
    }

    public static byte shortToByte(short i) {
        return (byte) i;
    }

    public static byte charToByte(char i) {
        return (byte) i;
    }

    public static byte intToByte(int i) {
        return (byte) i;
    }

    public static byte longToByte(long i) {
        return (byte) i;
    }

    public static byte floatToByte(float i) {
        return (byte) i;
    }

    public static byte doubleToByte(double i) {
        return (byte) i;
    }

    public static short charToShort(char i) {
        return (short) i;
    }

    public static short intToShort(int i) {
        return (short) i;
    }

    public static short longToShort(long i) {
        return (short) i;
    }

    public static short floatToShort(float i) {
        return (short) i;
    }

    public static short doubleToShort(double i) {
        return (short) i;
    }

    public static char intToChar(int i) {
        return (char) i;
    }

    public static char longToChar(long i) {
        return (char) i;
    }

    public static char floatToChar(float i) {
        return (char) i;
    }

    public static char doubleToChar(double i) {
        return (char) i;
    }

    public static int longToInt(long i) {
        return (int) i;
    }

    public static int floatToInt(float i) {
        return (int) i;
    }

    public static int doubleToInt(double i) {
        return (int) i;
    }

    public static long floatToLong(float i) {
        return (long) i;
    }

    public static long doubleToLong(double i) {
        return (long) i;
    }

    public static float doubleToFloat(double i) {
        return (float) i;
    }
}
