package lesson13.accounting;

public class FullReport {
    public static void generateReport(Employee[] workers) {
        for (Employee worker : workers) {
            System.out.printf("Employee %s gets %.2f per month {%td}.\n", worker.getFullName(), worker.getSalary(), worker.getSalaryDate());
        }
    }
}
