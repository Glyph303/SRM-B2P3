// Create a program to find the total income of a person by taking salary and bonus from user
import java.util.Scanner;

public class IncomeCalculatorBonus  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double salary, bonus, totalIncome;
			
		// Take input

        System.out.print("Enter your Salary in INR:  ");
        salary = input.nextInt();   	   
		
		System.out.print("Enter your Bonus in INR:  ");
        bonus = input.nextInt();   
        
		   
		
		// operations
		totalIncome = salary + bonus;
		
        // Print the output
        System.out.println("Total Income based on bonus is " + totalIncome);
		 
    }
}
