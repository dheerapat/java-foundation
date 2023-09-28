package Foundation;

public class DataType {
    public static void main(String[] args) {
        // primitive type
        int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInit = 'D';
        char studentLastInit = 'T';
        boolean studentAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInit);
        System.out.println(studentLastInit);
        System.out.println(studentAttendance);

        // reference type
        String studentName = "Mikaela Angel"; // string is combination of char
        String studentFirstName = "Mikaela";
        String studentLastname = "Angel";

        System.out.println(studentName);

        studentFirstInit = studentFirstName.charAt(0);
        studentLastInit = studentLastname.charAt(0);

        System.out.println(studentFirstInit);
        System.out.println(studentLastInit);

    }
}
