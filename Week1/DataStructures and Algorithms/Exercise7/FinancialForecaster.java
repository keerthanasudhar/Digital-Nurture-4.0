package dsa;
import java.util.Scanner;
public class FinancialForecaster {

    // Recursive method to calculate future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue; // base case
        }
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter initial investment amount: ₹");
        double initialValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.08 for 8%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        // Calculate future value
        double futureValue = predictFutureValue(initialValue, growthRate, years);

        // Display result
        System.out.printf("Predicted Future Value after %d years: ₹%.2f\n", years, futureValue);

        scanner.close();

    }
}