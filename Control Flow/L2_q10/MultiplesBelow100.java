import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiples of " + number + " below 100:");

        // Loop backwards from 100 to 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
