package lesson13.Accounting;

import java.util.Date;

public class ReportDemo {
    public static void main(String[] args) {
        Employee[] workers = {new Employee("Dima", "Boss", 15000.484, new Date(1994, 0, 5)),
                new Employee("Katya", "cleaner", 1234.93, new Date(1994, 0, 13)),
                new Employee("Arthur", "engineer", 12345.6655, new Date(1994, 0, 16))};
        FullReport.generateReport(workers);
        System.out.println(workers[1].toString());
    }
}
