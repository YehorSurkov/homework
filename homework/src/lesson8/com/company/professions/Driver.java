package lesson8.com.company.professions;

import lesson8.Person;

public class Driver extends Person {
    private String firstName;
    private String lastName;
    private int experience;

    public Driver(String firstName, String lastName, int age, int experience) {
        super(firstName + " " + lastName, age);
        this.experience = experience;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
