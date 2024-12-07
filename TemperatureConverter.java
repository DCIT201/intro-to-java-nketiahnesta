import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Display options to the user
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        
        // Accept the user's choice
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        // Check if user's selection is correct
        if (choice == 1 || choice == 2) {
            // Get the temperature value from the user
            System.out.print("Enter the temperature value: ");
            double temperature = scanner.nextDouble();

            // Perform the conversion based on the user's selection
            if (choice == 1) {
                // Convert Celsius to Fahrenheit
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.\n", temperature, fahrenheit);
            } else {
                // Convert Fahrenheit to Celsius
                double celsius = (temperature - 32) * 5 / 9;
                System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.\n", temperature, celsius);
            }
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        // Close the scanner
        scanner.close();
    }
}
