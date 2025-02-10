import java.util.Scanner;

public class KmToMiles_Scanner {

    public static void main(String[] args) {
        // Create a Scanner object to take user input from standard input
        Scanner input = new Scanner(System.in);

        // Declare variable km
        double km;

        // Prompt user to enter the distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Convert kilometers to miles
        double miles = km / 1.6;

        // Print the output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");
    }
}
