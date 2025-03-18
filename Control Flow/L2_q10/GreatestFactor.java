import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int greatestFactor = 1; // Variable to store the greatest factor
        int counter = number - 1; // Start checking from number - 1

        // While loop to find the greatest factor
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // Stop at the first (largest) factor found
            }
            counter--; // Decrement counter
        }

        // Output the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        scanner.close();
    }
}
