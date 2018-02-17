package lesson16;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Ex4 {
    public static void main(String[] args) {
        String str = "1,2,3,4,5,6,4,7,7,4,6";

        System.out.println(remover(str));
    }

    static String remover(String str) {
        Pattern p = Pattern.compile(",");
        String[] s = p.split(str);
        Set<Integer> set = new TreeSet<>();
        for (String s1 : s) {
            set.add(Integer.valueOf(s1));
        }
        return set.toString();
    }
}
