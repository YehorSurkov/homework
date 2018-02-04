package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {
    public static void main(String[] args) {
        String str = "If you have not-passed tasks, you may start from the first of them. 123 324 111 4554";
        numericPelSearcher(str);
    }

    public static void numericPelSearcher(String str) {
        Pattern p = Pattern.compile("\\.|-|\\s");
        String[] words = p.split(str);
        p = Pattern.compile("\\d+");
        Matcher m;
        for (String w : words) {
            m = p.matcher(w);
            if (m.find() && w.equals(new StringBuilder(w).reverse().toString())) {
                System.out.println(w);
            }
        }
    }
}
