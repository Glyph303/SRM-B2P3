// Create a program to swap two numbers
import java.util.Scanner;

public class NumberSwap  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        int num1, num2, num3 = 0;
			
		// Take input

        System.out.print("Input number 1 :  ");
        num1 = input.nextInt();   	   
		
		System.out.print("Input number 2:  ");
        num2 = input.nextInt();   
        
		   
		
		// operations
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
        // Print the output
        System.out.println("The swapped numbers are " + num1 + "\t" +  num2);
		 
    }
}
