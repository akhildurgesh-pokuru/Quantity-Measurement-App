import java.util.Scanner;

public class Inch_to_Feet_Conversion {
    // Named constant for unit conversion
    private static final int INCHES_PER_FOOT = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length in inches: ");
        if (scanner.hasNextDouble()) {
            double totalInches = scanner.nextDouble();

            // 1. Exact conversion (Decimal value)
            double totalFeet = totalInches / INCHES_PER_FOOT;

            // 2. Breakdown version (e.g., 26 inches becomes 2 feet and 2 inches)
            int wholeFeet = (int) totalInches / INCHES_PER_FOOT;
            double remainingInches = totalInches % INCHES_PER_FOOT;

            // Display results
            System.out.println("\n--- Conversion Results ---");
            System.out.printf("Exact value in feet: %.2f ft%n", totalFeet);
            System.out.printf("Standard breakdown: %d feet and %.1f inches%n", wholeFeet, remainingInches);
        } else {
            System.out.println("Invalid input. Please enter a numerical value.");
        }

        scanner.close();
    }
}
