// create a program to calculate simple interest

import java.util.Scanner;

public class SimpleInterest_Input  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double principal, rate, time, interest, finalAmount;
			
		// Take input

        System.out.print("Input principal amount in INR:  ");
        principal = input.nextDouble();   	   
		
		System.out.print("Input rate in % :  ");
        rate = input.nextDouble();   
		System.out.print("Input Time in years :  ");
        time = input.nextDouble();   
        
		   
		
		// operations
		interest= (principal*rate*time)/100;
		finalAmount = principal + interest;
		
		
        // Print the output
        System.out.println("The user will have to pay a total amount of " + finalAmount+ "with a calculated interest of " + interest);
		 
    }
}
