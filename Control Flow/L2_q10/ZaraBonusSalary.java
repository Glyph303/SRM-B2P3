import java.util.Scanner;
public class ZaraBonusSalary { 
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	int salary, years, bonus, bonusSalary;

	//Input 
	System.out.println("Enter your salary in INR: ");
	  salary = scanner.nextInt();
	System.out.println("Enter number of years of service: ");
	  years = scanner.nextInt();
	
	bonus = (5/100)*salary;
	bonusSalary = bonus + salary;
	if(years > 5){
	System.out.println(" Thank you for your service. Your new salary is: \n " + bonusSalary);
	}
	else{
		System.out.println("You will receive a bonus 5% increase in salary after completion of 5 years");
	}
}
}
