import java.util.Scanner;

public class SmallestOf3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double num1, num2, num3;
		
		// take inputs

        System.out.print("Enter the 1st number: ");
        num1 = input.nextDouble();   	
		System.out.print("Enter the 2nd number: ");
        num2 = input.nextDouble();   
		System.out.print("Enter the 3rd number: ");
        num3 = input.nextDouble();   
		
        // operation and output
        if(num1 < num2 && num1 < num3){
		System.out.println(" The 1st number is the smallest of all 3 ");	
		}
		else{
		System.out.println(" 1st number is not the smallest"); }

			
		 
    }
}
