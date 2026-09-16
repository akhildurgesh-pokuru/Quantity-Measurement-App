import java.util.Scanner;

public class FeetToInches {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length in feet: ");
        // Read the input as a double to handle decimal values (e.g., 5.5 feet)
        double feet = scanner.nextDouble();

        // Conversion logic: 1 foot = 12 inches
        double inches = feet * 12;

        // Display the final result
        System.out.println(feet + " feet is equal to " + inches + " inches.");

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
