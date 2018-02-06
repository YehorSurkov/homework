package lesson13;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar myBirthday = new GregorianCalendar(1994, 8, 27);
        Calendar current = new GregorianCalendar();

        System.out.println(myBirthday.get(myBirthday.DAY_OF_WEEK));
        System.out.println(myBirthday.get(myBirthday.WEEK_OF_YEAR));
        System.out.println(myBirthday.get(myBirthday.DAY_OF_YEAR));
        System.out.println("I've already lived " + (current.getTimeInMillis() - myBirthday.getTimeInMillis()) + " msec.");

        Date myBirth = new Date(94, 8, 27);
        System.out.println(DateFormat.getDateInstance(DateFormat.LONG).format(myBirth));
        System.out.println(DateFormat.getDateInstance(DateFormat.MEDIUM).format(myBirth));
        System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(myBirth));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL).format(myBirth));
    }
}
