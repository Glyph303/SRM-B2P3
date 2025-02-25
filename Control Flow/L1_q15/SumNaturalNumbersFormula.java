import java.util.Scanner;
public class SumNaturalNumbersFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        
        if (n > 0) {
            // formula
            int formulaSum = n * (n + 1) / 2;

            // Compute using while loop
            int whileSum = 0;
            int i = 1;
            while (i <= n) {
                whileSum += i;
                i++;
            }

            // Display both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);

            // Compare results
            if (formulaSum == whileSum) {
                System.out.println("Both computations match");
            } else {
                System.out.println(" Computations do not match");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

       
    }
}
