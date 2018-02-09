package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaVersions {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java6, Java   7, Java 8.";
        Pattern p = Pattern.compile(";|\\.|:|,", Pattern.CASE_INSENSITIVE);
        String[] versions = p.split(str);
        p = Pattern.compile("java\\s*\\d+", Pattern.CASE_INSENSITIVE);
        Matcher m;
        for (String ver : versions) {
            m = p.matcher(ver);
            if (m.find()) {
                p = Pattern.compile("\\s");
                String[] s = p.split(ver);
                String f = "";
                for (String el : s) {
                    el = el.trim();
                    if (el.length() > 0) {
                        f += el;
                    }
                }
                System.out.println(f);
            }
        }
    }
}
