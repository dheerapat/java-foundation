package Function;

public class Parameters {
    public static void calculateTotalMealPrice(double listedPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        System.out.println("Your total meal price is: " + result);
    }

    public static void  main(String[] args) {
        calculateTotalMealPrice(200, 0.15, 0.03);
    }
}
