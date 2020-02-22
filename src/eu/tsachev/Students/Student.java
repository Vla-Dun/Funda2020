package eu.tsachev.Students;


public class Student {

    private String firstName;
    private String lastName;
    private int yearsOld;
    private String homeTown;

    public Student(String firstName, String lastName, int yearsOld, String homeTown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOld = yearsOld;
        this.homeTown = homeTown;
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

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
}

