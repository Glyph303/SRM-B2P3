// create a program to find max handshakes

import java.util.Scanner;

public class MaxHandshakes  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double numberOfStudents, maxHandshakes;
			
		// Take input

        System.out.print("Input number of students:  ");
        numberOfStudents = input.nextDouble();   	   
			
		// operations
		maxHandshakes = (numberOfStudents*(numberOfStudents-1))/2;
		
		
        // Print the output
        System.out.println("There will be a maximum of " + maxHandshakes + " handshakes");
		 
    }
}
