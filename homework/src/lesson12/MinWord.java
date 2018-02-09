package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MinWord {
    public static void main(String[] args) {
        String text = "Object-oriented programming uses objects, but not all of the associated techniques and structures " +
                "are supported directly in languages that claim to support object-oriented programming. The features listed below are, however," +
                "common among languages considered strongly class and object-oriented (or multi-paradigm with OBJECT-ORIENTED PROGRAMMING support)," +
                "with notable exceptions mentioned 19292 19282939 128 123923989";
        String text2 = "-jekeflkf lefkle 200jk dkd 3ndlddf 200dkdd 000 eeleeev+frr ff";

        System.out.println(minUniqueWord(text));
        System.out.println(numberOfLatin(text));
        System.out.println(minCharNumberWord(text2));
    }

    public static String minUniqueWord(String text) {
        Pattern p = Pattern.compile(",|\\.|:|;|\\(|\\)|\\s|-|\\+");
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

    public static String minCharNumberWord(String text) {
        Pattern p = Pattern.compile(",|\\.|:|;|\\(|\\)|\\s|-\\+");
        String[] words = p.split(text);

        String minCharWord = words[0];
        for (String w : words) {
            w = w.trim();
            if (getNumOfUniqChars(minCharWord) > getNumOfUniqChars(w) && w.length() > 0) {
                minCharWord = w;
            }
        }
        return minCharWord;
    }

    public static int getNumOfUniqChars(String w) {
        StringBuilder setOfChars = new StringBuilder();
        String ch;
        for (int i = 0; i < w.length(); i++) {
            ch = String.valueOf(w.charAt(i));
            if (setOfChars.indexOf(ch) == -1)
                setOfChars.append(ch);
        }
        return setOfChars.length();
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
