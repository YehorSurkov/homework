package lesson13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HolidayCalendar {
    public static void main(String[] args) {
        Date[] calendar = {new Date(2018, 4, 7),
                new Date(2018, 7, 3),
                new Date(2018, 9, 16)};

        SimpleDateFormat[] sdf = new SimpleDateFormat[3];

        sdf[0] = new SimpleDateFormat("dd   MM   yy hh:mm");
        sdf[1] = new SimpleDateFormat("dd:MM:YYYY");
        sdf[2] = new SimpleDateFormat("hh:mm");

        for (int i = 0; i < 3; i++) {
            System.out.println(sdf[i].format(calendar[i]));
        }
    }
}
