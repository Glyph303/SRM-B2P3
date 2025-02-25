import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input countdown starting number
        System.out.print("Enter countdown starting number: ");
        int counter = scanner.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Launch message
        System.out.println("Initiating Launch");

       
    }
}
