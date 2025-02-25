import java.util.Scanner;
public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // if loop
        if (n >= 0) {
            // Compute factorial using for loop
            long factorial = 1; // Using long to handle large values

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // answer print
            System.out.println("Factorial of " + n + " is: " + factorial);
        } else {
            System.out.println("The number " + n + " is not a positive integer.");
        }

        
    }
}
