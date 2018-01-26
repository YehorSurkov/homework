package lesson12;

/**
 * Created by Student on 24.01.2018.
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Yes";
        String s2 = "No";
        String s3 = "I like cakes";
        String s4 = "I like Java";
        String s5 = "    You    ";

        endW(s1);
        endW(s2);
        endW(s3);
        cA(s2);
        cA(s3);

        System.out.println(s1.replace("Y", "o"));
        System.out.println(s2.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s5.trim());

        System.out.println(s4.substring(s4.indexOf("J"), s4.indexOf("J") + "Java".length()));

    }

    public static void endW(String s) {
        System.out.println(s.endsWith("s"));
    }

    public static void cA(String s) {
        System.out.println(s.charAt(s.length() - 1));
    }
}
