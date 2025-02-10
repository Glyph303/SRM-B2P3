import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double num1, num2;

        System.out.print("Enter Number 1");
        num1 = input.nextDouble();        
		
		System.out.print("Enter Number 2");
        num2 = input.nextDouble();        
        
        double addition = num1 + num2;
        double subtraction = num1 - num2;
		double multiplication = num1*num2;
		double division = num1/num2;

        // Print the output
        System.out.println("Addition of numbers is " + addition) ; 
		System.out.println("Subtraction of numbers is " + subtraction) ;
		System.out.println("Multiplication of numbers is " + multiplication) ; 
	    System.out.println("Division of numbers is " + division) ; 
    }
}
