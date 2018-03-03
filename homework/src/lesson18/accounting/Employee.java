package lesson18.accounting;

import java.text.NumberFormat;
import java.util.*;

public class Employee {
    private String fullName;
    private String position;
    private double salary;
    private Calendar salaryDate;

    public Employee(String fullName, String position, double salary, Calendar sD) {
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

    public Calendar getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Calendar salaryDate) {
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
        return f.format("Employee %s obtains %s position and gets " + NumberFormat.getInstance(loc).format(salary) + " salary", fullName, position).toString();
    }
}
