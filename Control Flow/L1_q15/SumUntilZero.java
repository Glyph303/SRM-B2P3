import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // declare variables
        double total = 0.0;
        double number; 

        // Loop 
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextDouble();

            
            if (number == 0) {
                break;
            }

            total += number; // Add number to total
        }

        // Display result
        System.out.println("The total sum is: " + total);

        
    }
}
