import java.util.Scanner;

public class IntOperation  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        int a, b, c;
		
		// Take input

        System.out.print("Enter first number :  ");
        a = input.nextInt();   	   
		
        System.out.print("Enter second number : ");
        b = input.nextInt();   
		
	    System.out.print("Enter third number : ");
        c = input.nextInt();   
		
		// operations
		int op1 = a + b *c; 
		int op2 = a * b + c;
		int op3 = c + a / b;
		int op4 = a % b + c;
		
		

        // Print the output
        System.out.println("Operation 1: " + op1 + "\n Operation 2: " +op2 );
		 System.out.println("Operation 3: " + op3 + "\n Operation 4: " + op4 );
		 
    }
}
