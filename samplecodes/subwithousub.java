// program to add without using +
import java.util.Scanner;

public class subwithousub  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        int a, b, c;
			
		// Take input

        System.out.print("Enter first number :  ");
        a = input.nextInt();   	   
		
        System.out.print("Enter second number : ");
        b = input.nextInt();   	
		
		   
		
		// operations
		//c = ~(~a + b); 
		c=a+~b+1;
		
        // Print the output
        System.out.println("Result without using - operator is " + c);
		 
    }
}
