import java.util.Scanner;

public class SideSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double sideOfSquare;

        System.out.print("Enter base value");
        sideOfSquare = input.nextDouble();   	   
        
        double perimeterSquare = (0.25)*sideOfSquare;

        // Print the output
        System.out.println("Side of the square is " + perimeterSquare) ; 
		 
    }
}
