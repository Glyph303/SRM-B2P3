import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double num1, num2;

        System.out.print("Enter first number :  ");
        num1 = input.nextDouble();   	   
		
        System.out.print("Enter second number : ");
        num2 = input.nextDouble();   
        
		double quotient = num1/ num2; 
		double remainder = num1 % num2;

        // Print the output
        System.out.println("Quotient is " + quotient + " and Remainder is " + remainder);
		 
    }
}
