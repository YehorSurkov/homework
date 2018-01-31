package lesson12.Accounting;

public class ReportDemo {
    public static void main(String[] args) {
        Employee[] workers = {new Employee("Dima", "Boss", 15000.484),
                new Employee("Katya", "cleaner", 1234.938),
                new Employee("Arthur", "engineer", 12345.6)};
        Report.generateReport(workers);
        System.out.println(workers[1].toString());
    }
}
