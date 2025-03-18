import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input from user
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // initializing result
        int result = 1;

        // Compute power using a for loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // output
        System.out.println(number + " raised to the power " + power + " is: " + result);

       
    }
}
