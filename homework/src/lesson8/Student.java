package lesson8;

/**
 * Created by student on 10.01.2018.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    Student(String fN, String lN, String g, double ave) {
        firstName = fN;
        lastName = lN;
        group = g;
        averageMark = ave;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        if (averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
