package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OOP {
    public static void main(String[] args) {
        String text = "Object-oriented programming uses objects, but not all of the associated techniques and structures \n" +
                "are supported directly in languages that claim to support object-oriented programming. The features listed below are, however,\n" +
                "common among languages considered strongly class and object-oriented (or multi-paradigm with OBJECT-ORIENTED PROGRAMMING support),\n" +
                "with notable exceptions mentioned";

        System.out.println(toOOP1(text) + '\n');
        System.out.println(toOOP2(text) + '\n');
        System.out.println(toOOP1(text).equals(toOOP2(text)));
    }

    public static String toOOP1(String text) {
        String str = "[Oo][Bb][Jj][Ee][Cc][Tt]\\s*-\\s*[Oo][Rr][Ii][Ee][Nn][Tt][Ee][Dd]\\s" +
                "+[Pp][Rr][Oo][Gg][Rr][Aa][Mm]{2}[Ii][Nn][Gg]";
        return text.replaceAll(str, "OOP");
    }

    public static String toOOP2(String text) {
        Pattern p = Pattern.compile("object\\s*-\\s*oriented\\s+program{2}ing", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        return m.replaceAll("OOP");
    }
}
