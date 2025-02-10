import java.util.Scanner;

public class FeetToYardsMiles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double feet;

        System.out.print("Enter distance in feet ");
        feet = input.nextDouble();   	   
        
        double yards = (1.0/3)*feet;
		double miles = (1.0/1760) * yards;

        // Print the output
        System.out.println("Distance inputted is" + feet + "\n Distance in yards is " + yards + "\n Distance in miles is " + miles);
		 
    }
}
