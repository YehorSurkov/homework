package lesson8;

/**
 * Created by student on 10.01.2018.
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student im = new Student("Yehor", "Surkov", "TL55", 4.5);
        Student igor = new Student("Igor", "Domnich", "TL55", 4.5);
        Student adam = new StudentPhD("Adam", "Arsl", "TYa55", 5.0, "Semi-bare electrons and protons");
        Student dimas = new StudentPhD("Dimas", "Vozn", "TYa52", 4.0, "Detectors for neutrinos");

        Student[] group = {im, igor, adam, dimas};

        for (Student stdnt : group) {
            System.out.println(stdnt.getFirstName() + " " + stdnt.getLastName() + " recieves " + stdnt.getScholarship() + " hryvnas per month.");
        }
    }
}
