import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // if operation
        if (n >= 0) {
            // Compute factorial using while loop
            long factorial = 1; // Using long to handle large values
            int i = n;

            while (i > 0) {
                factorial *= i;
                i--;
            }

            // print answerr
            System.out.println("Factorial of " + n + " is: " + factorial);
        } else {
            System.out.println("The number " + n + " is not a positive integer.");
        }

        
    }
}
