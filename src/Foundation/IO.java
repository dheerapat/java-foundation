package Foundation;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        double studentGPA = 3.45;
        String studentFirstName = "Mikaela";
        String studentLastName = "Angel";

        System.out.println(studentFirstName + " " + studentLastName + ": " + studentGPA);
        System.out.println("Do you want to update?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + ": " + studentGPA);
    }
}
