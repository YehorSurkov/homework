package lesson18.accounting;

import java.util.GregorianCalendar;

public class ReportDemo {
    public static void main(String[] args) {
        Employee[] workers = {new Employee("Dima", "Boss", 15000.484, new GregorianCalendar(1994, 0, 5)),
                new Employee("Katya", "cleaner", 1234.93, new GregorianCalendar(1994, 0, 13)),
                new Employee("Arthur", "engineer", 12345.6655, new GregorianCalendar(1994, 0, 16))};
        FullReport.generateReport(workers);
        System.out.println(workers[1]);
    }
}
