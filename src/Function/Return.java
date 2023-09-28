package Function;

public class Return {
    public static double calculateTotalMealPrice(double listedPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result;

        result = listedPrice + tip + tax;

        return result;
    }
    public static void main(String[] args) {
        double peopleNum = 5;
        double total = calculateTotalMealPrice(200, 0.2, 0.06);
        System.out.println(total);

        double individualCost = total / peopleNum;
        System.out.println(individualCost);
    }
}
