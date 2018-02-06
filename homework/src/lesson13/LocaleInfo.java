package lesson13;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleInfo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Locale tasksEn = new Locale("en", "TSK");
        Locale tasksRu = new Locale("ru", "TSK");
        Locale test = new Locale("", "");

        printLocaleInfo(test);
        printLocaleInfo(tasksEn);
        printLocaleInfo(tasksRu);
    }

    public static void printLocaleInfo(Locale locale) throws UnsupportedEncodingException {
        ResourceBundle rb = ResourceBundle.getBundle("base", locale);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
        }
        System.out.println();
    }
}
