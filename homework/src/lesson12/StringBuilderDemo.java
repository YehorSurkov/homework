package lesson12;

public class StringBuilderDemo {
    public static void main(String[] args) {
        int i1 = 3;
        int i2 = 56;

        StringBuilder[] sB = {new StringBuilder(), new StringBuilder(), new StringBuilder()};
        sB[0].append(i1 + "+" + i2 + "=" + (i1 + i2));
        sB[1].append(i1 + "-" + i2 + "=" + (i1 - i2));
        sB[2].append(i1 + "*" + i2 + "=" + i1 * i2);
        for (StringBuilder str : sB) {
            System.out.println(str);
        }

        StringBuilder[] sB1 = {new StringBuilder(), new StringBuilder(), new StringBuilder()};
        sB1[0].append(i1 + "+" + i2 + "=" + (i1 + i2));
        sB1[1].append(i1 + "-" + i2 + "=" + (i1 - i2));
        sB1[2].append(i1 + "*" + i2 + "=" + i1 * i2);
        StringBuilder[] sB2 = {new StringBuilder(), new StringBuilder(), new StringBuilder()};
        sB2[0].append(i1 + "+" + i2 + "=" + (i1 + i2));
        sB2[1].append(i1 + "-" + i2 + "=" + (i1 - i2));
        sB2[2].append(i1 + "*" + i2 + "=" + i1 * i2);
        for (int i = 0; i < sB.length; i++) {
            System.out.println(replacer1(sB1[i]));
            System.out.println(replacer2(sB2[i], " equals "));
        }

    }

    public static StringBuilder replacer1(StringBuilder str) {
        str.insert(str.indexOf("="), " equals ");
        return str.deleteCharAt(str.indexOf("="));
    }

    public static StringBuilder replacer2(StringBuilder str, String insertedWord) {
        String s = " ";
        for (int i = 0; i < insertedWord.length() - 2; i++) {
            s += " ";
        }
        str.insert(str.indexOf("=") + 1, s);
        return str.replace(str.indexOf("="), str.indexOf("=") + insertedWord.length(), insertedWord);
    }
}
