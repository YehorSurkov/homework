package lesson12;

public class MiddleSymbolsDemo {
    public static void main(String[] args) {
        String text1 = "Seven Dwarfs";
        String text2 = "SnowWhite";
        String text3 = "Cinderella";
        String text4 = "Mermaid";

        System.out.println(middSymbols(text1));
        System.out.println(middSymbols(text2));
        System.out.println(middSymbols(text3));
        System.out.println(middSymbols(text4));
    }

    public static String middSymbols(String str) {
        if (str.length() % 2 == 1) {
            str += " ";
        }
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}
