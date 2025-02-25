import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 
        System.out.print("Enter countdown starting number: ");
        int counter = scanner.nextInt();

        // Countdown using while 
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement counter
        }

        // output
        System.out.println("Initiating Launch");

        
    }
}
