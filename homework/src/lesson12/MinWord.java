package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MinWord {
    public static void main(String[] args) {
        String text = "Object-oriented programming uses objects, but not all of the associated techniques and structures " +
                "are supported directly in languages that claim to support object-oriented programming. The features listed below are, however," +
                "common among languages considered strongly class and object-oriented (or multi-paradigm with OBJECT-ORIENTED PROGRAMMING support)," +
                "with notable exceptions mentioned 19292 19282939 128 123923989";
        System.out.println(minUniqueWord(text));
        System.out.println(numberOfLatin(text));
    }

    public static String minUniqueWord(String text) {
        Pattern p = Pattern.compile(",|\\.|:|;|\\(|\\)|\\s|-");
        String[] words = p.split(text);
        String minWord = words[0];
        Matcher m;
        for (String w : words) {
            if (w.length() < minWord.length() && w.length() > 1) {
                p = Pattern.compile("(.?){" + w.length() + "}", Pattern.CASE_INSENSITIVE);
                m = p.matcher(w);
                if (m.find()) {
                    minWord = w;
                }
            }
        }
        return minWord;
    }

    public static int numberOfLatin(String text) {
        int number = 0;
        Pattern p = Pattern.compile(",|\\.|:|;|\\(|\\)|\\s|-");
        String[] words = p.split(text);
        Matcher m;
        for (String w : words) {
            p = Pattern.compile("([a-z]){" + w.length() + "}");
            m = p.matcher(w);
            if (m.find()) {
                number++;
            }
        }
        return number;
    }
}
