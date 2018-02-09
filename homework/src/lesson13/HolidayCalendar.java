package lesson13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class HolidayCalendar {
    public static void main(String[] args) {
        Date[] calendar = {new GregorianCalendar(2018, 4, 7).getTime(),
                new GregorianCalendar(2018, 7, 3).getTime(),
                new GregorianCalendar(2018, 9, 16).getTime()};

        SimpleDateFormat[] sdf = new SimpleDateFormat[3];

        sdf[0] = new SimpleDateFormat("dd   MM   yy        hh:mm");
        sdf[1] = new SimpleDateFormat("dd:MM:YYYY");
        sdf[2] = new SimpleDateFormat("hh:mm");

        for (int i = 0; i < 3; i++) {
            System.out.println(sdf[i].format(calendar[i]));
        }
    }
}
