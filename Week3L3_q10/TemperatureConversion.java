// program to add without using +
import java.util.Scanner;

public class TemperatureConversion  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double celcius, farenheitResult;
			
		// Take input

        System.out.print("Enter temperature in Celcius:  ");
        celcius = input.nextInt();   	   
		
        
		   
		
		// operations
		farenheitResult = (celcius* (9/5)) + 32;
		
        // Print the output
        System.out.println("The temperature in Farenheit is " + farenheitResult);
		 
    }
}
