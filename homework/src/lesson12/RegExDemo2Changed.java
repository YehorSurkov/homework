package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo2Changed {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".*c+ab.*");
        Matcher matcher = pattern.matcher("dkjfkjfcabekkefjkejkf");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
