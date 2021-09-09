package exercises.school;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private double yearsTeaching;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String subject, double yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(double yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}