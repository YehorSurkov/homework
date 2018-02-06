package lesson13.Accounting;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.Objects;

public class Employee {
    private String fullName;
    private String position;
    private double salary;
    private Date salaryDate;

    public Employee(String fullName, String position, double salary, Date sD) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        salaryDate = sD;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(fullName, employee.fullName) &&
                Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fullName, position, salary);
    }

    @Override
    public String toString() {
        Formatter f = new Formatter();
        Locale loc = Locale.getDefault();
        return f.format("Employee %s obtains %s position and get " + NumberFormat.getInstance(loc).format(salary) + " salary", fullName, position).toString();
    }
}
