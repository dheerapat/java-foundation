package Function;

import java.util.Scanner;

public class SalaryCalculator {
    public static double calculateSalary(double workHour, double moneyPerHour, int vacationCount) {
        if (workHour < 0 || moneyPerHour < 0) {
            return 0;
        }

        double annualWorkHour = (52 * workHour) - (vacationCount * 8);
        double result;
        result = annualWorkHour * moneyPerHour;

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double workHour = input.nextDouble();
        double perHourRate = input.nextDouble();
        int vacationCount = input.nextInt();

        double salary = calculateSalary(workHour, perHourRate, vacationCount);
        System.out.println("$" + salary);
    }
}
