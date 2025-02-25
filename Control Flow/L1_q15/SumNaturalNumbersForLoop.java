import java.util.Scanner;
public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // if input is a natural number 
        if (n > 0) {
            // formula sum
            int formulaSum = n * (n + 1) / 2;

            // loop sum
            int forSum = 0;
            for (int i = 1; i <= n; i++) {
                forSum += i;
            }

            // anser
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forSum);

            // Compare results
            if (formulaSum == forSum) {
                System.out.println("Both computations match!");
            } else {
                System.out.println("Computations do not match, there is an error.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

       
    }
}
