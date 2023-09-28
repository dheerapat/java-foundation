package Classes;

public class Student {
    String firstName;
    String lastName;
    String major;
    double gpa;
    int expectedYearGraduate;

    public Student(String firstName, String lastName, String major, double gpa, int expectedYearGraduate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa = gpa;
        this.expectedYearGraduate = expectedYearGraduate;
    }

    public void incrementGraduateYear() {
        this.expectedYearGraduate += 1;
    }

    public void changeMajor(String major) {
        this.major = major;
    }
}
