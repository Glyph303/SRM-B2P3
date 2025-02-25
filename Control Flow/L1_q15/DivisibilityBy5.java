import java.util.Scanner;

public class DivisibilityBy5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double number;

        System.out.print("Enter the number: ");
        number = input.nextDouble();   	   
        
        if(number % 5 == 0){
		System.out.println(" The number is divisible by 5");	
		}
		else{
		System.out.println(" The number is not divisible by 5"); }

			
		 
    }
}
