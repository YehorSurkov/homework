package lesson18.accounting;

import java.io.IOException;
import java.io.PrintWriter;

public class FullReport {
    public static void generateReport(Employee[] workers) {
        try (PrintWriter fw = new PrintWriter("src\\io\\employee_report.txt")) {
            for (Employee worker : workers) {
                fw.printf("Employee %s gets %.2f per month {%td}.\n", worker.getFullName(), worker.getSalary(), worker.getSalaryDate());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Employee worker : workers) {
            System.out.printf("Employee %s gets %.2f per month {%td}.\n", worker.getFullName(), worker.getSalary(), worker.getSalaryDate());
        }
    }
}
