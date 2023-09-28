package Classes;

public class School {
    public static void main(String[] args) {
        Student profileA = new Student("Sally", "Doe", "Film", 3, 2022);
        Student profileB = new Student("Lilly", "Goods", "Medicine", 3.5, 2021);

        profileA.changeMajor("Communication");
        System.out.println(profileA.major);

        profileB.incrementGraduateYear();
        System.out.println(profileB.expectedYearGraduate);
    }
}
