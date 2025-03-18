import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the exponent (power): ");
        int power = scanner.nextInt();

        // Initialize result and counter
        int result = 1;
        int counter = 0;

        // While loop to calculate power
        while (counter < power) {
            result *= number; // Multiply result by number
            counter++; // Increment counter
        }

        // Print the final result
        System.out.println(number + "^" + power + " = " + result);

        scanner.close();
    }
}
