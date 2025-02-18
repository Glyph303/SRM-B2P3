import java.util.Scanner;

public class PoundsToKg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double pounds, kg;

        System.out.print("Enter weight in pounds: ");
        pounds = input.nextDouble();   	   
        
        kg = pounds/(2.2);

        // Print the output
        System.out.println("weight in kg is " + kg);
		 
    }
}
