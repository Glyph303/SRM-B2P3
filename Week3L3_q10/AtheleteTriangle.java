// q6 w3l3
import java.util.Scanner;

public class AtheleteTriangle  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        int side1, side2, side3, perimeter;
		double rounds;
			
		// Take input

        System.out.print("Input length of side 1 :  ");
        side1 = input.nextInt();   	   
		
		System.out.print("Input length of side 2:  ");
        side2 = input.nextInt();   
		System.out.print("Input length of side 3:  ");
        side3 = input.nextInt(); 
        
		   
		
		// operations
		perimeter = side1 + side2+ side3;
		rounds = perimeter * 5000;
		
        // Print the output
        System.out.println("The athelete must run " + rounds + " rounds to cover atleast 5km");
		 
    }
}
