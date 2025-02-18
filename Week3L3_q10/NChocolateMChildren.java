// Create a program to divide N number of chocolates among M children.

import java.util.Scanner;

public class NChocolateMChildren  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        int N, M;
		int remainder, quotient;
			
		// Take input

        System.out.print("Input number of chocolates :  ");
        N = input.nextInt();   	   
		
		System.out.print("Input number of children:  ");
        M = input.nextInt();   
        
		   
		
		// operations
		quotient = N/M;
		remainder = N%M;
		
		
        // Print the output
        System.out.println("So " + quotient + " chocolates are divided amongst "+ M +  " and  " + remainder + " chocolates are left behind");
		 
    }
}
