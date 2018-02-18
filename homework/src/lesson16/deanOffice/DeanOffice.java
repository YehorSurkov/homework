package lesson16.deanOffice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DeanOffice {
    public static void main(String[] args) {
        List<Student> uni = new ArrayList<>();
        uni.add(new Student("Yehor Surkov", "TL-54", 4, 7));
        uni.add(new Student("Ihor D", "TL-54", 4, 7));
        uni.add(new Student("NL", "TP-54", 3, 10));
        uni.add(new Student("LK", "TP-54", 3, 10));
        uni.add(new Student("AM", "TYA-54", 5, 5));
        uni.add(new Student("S1", "TG-54", 4, 12));
        uni.add(new Student("S2", "TG-54", 3, 17));
        uni.add(new Student("S3", "TH-54", 1, 12));
        uni.add(new Student("S4", "TH-54", 4, 19));

        whoIsRemain(uni);
        throwUni(uni, "TL-54");
    }

    public static List<Student> whoIsRemain(List<Student> uni) {
        ListIterator<Student> it = uni.listIterator();
        List<Student> success = new ArrayList<>();
        Student st;
        while (it.hasNext()) {
            st = it.next();
            if (st.gpa() > 2.5) {
                success.add(st);
                System.out.println(st.getFullName() + ", we have a grate opportunity to inform you... Our congrats!:) Your GPA is " + st.gpa());
            } else {
                System.out.println(st.getFullName() + ", ti is a stupid creature, nafig s plyagha! Your GPA is " + st.gpa());
            }
        }
        return success;
    }

    public static List<Student> throwUni(List<Student> uni, String group) {
        ListIterator<Student> it = uni.listIterator();
        List<Student> potok = new ArrayList<>();
        Student st;
        while (it.hasNext()) {
            st = it.next();
            if (st.getGroup().equals(group)) {
                potok.add(st);
                System.out.println(st.getFullName() + " " + st.getGroup());
            }
        }
        return potok;
    }
}
