package lesson12.accounting;

public class Report {
    public static void generateReport(Employee[] workers) {
        for (Employee worker : workers) {
            System.out.printf("Employee %s gets %.2f per month.\n", worker.getFullName(), worker.getSalary());
        }
    }
}
