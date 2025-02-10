import java.util.Scanner;

public class DoubleOpt  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double a, b, c;
		
		// Take input

        System.out.print("Enter first number :  ");
        a = input.nextDouble();   	   
		
        System.out.print("Enter second number : ");
        b = input.nextDouble();   
		
	    System.out.print("Enter third number : ");
        c = input.nextDouble();   
		
		// operations
		double op1 = a + b *c; 
		double op2 = a * b + c;
		double op3 = c + a / b;
		double op4 = a % b + c;
		
		

        // Print the output
        System.out.println("Operation 1: " + op1 + "\n Operation 2: " +op2 );
		 System.out.println("Operation 3: " + op3 + "\n Operation 4: " + op4 );
		 
    }
}
