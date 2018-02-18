package lesson16.deanOffice;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String fullName;
    private String group;
    private int course;
    private int[] marks;

    public Student() {

    }

    public Student(String fullName, String group, int course, int numberOfMarks) {
        this.fullName = fullName;
        this.group = group;
        this.course = course;
        marks = new int[numberOfMarks];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) Math.round(5 * Math.random());
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(fullName, student.fullName) &&
                Objects.equals(group, student.group) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(fullName, group, course);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                '}';
    }

    public double gpa() {
        double gPA = 0;
        for (int mark : marks) {
            gPA += mark;
        }
        return gPA / marks.length;
    }
}
