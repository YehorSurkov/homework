package lesson12;

public class OOP {
    public static void main(String[] args) {
        String text = "Object-oriented programming uses objects, but not all of the associated techniques and structures \n" +
                "are supported directly in languages that claim to support object-oriented programming. The features listed below are, however,\n" +
                "common among languages considered strongly class and object-oriented (or multi-paradigm with OBJECT-ORIENTED PROGRAMMING support),\n" +
                "with notable exceptions mentioned";

        toOOP(text);
    }

    public static void toOOP(String text) {
        String str = "[Oo][Bb][Jj][Ee][Cc][Tt]\\s*-\\s*[Oo][Rr][Ii][Ee][Nn][Tt][Ee][Dd]\\s" +
                "+[Pp][Rr][Oo][Gg][Rr][Aa][Mm]{2}[Ii][Nn][Gg]";
        System.out.println(text.replaceAll(str, "OOP"));
    }
}
