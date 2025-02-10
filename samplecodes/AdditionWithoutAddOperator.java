// program to add without using +
import java.util.Scanner;

public class AdditionWithoutAddOperator  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double a, b, a2, b2, c;
			
		// Take input

        System.out.print("Enter first number :  ");
        a = input.nextInt();   	   
		
        System.out.print("Enter second number : ");
        b = input.nextInt();   	
		
		   
		
		// operations
		a2 = a*a;
		b2 = b*b;
		c = (a2 - b2)/(a-b);
		
        // Print the output
        System.out.println("Result without using + operator is " + c);
		 
    }
}
