// program to convert farenheit to celcius
import java.util.Scanner;

public class TemperatureConversionInverse  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double farenheit, celciusResult;
			
		// Take input

        System.out.print("Enter temperature in Farenheit:  ");
        farenheit = input.nextInt();   	   
		
        
		   
		
		// operations
		celciusResult = ((farenheit-32) * (5/9)) ;
		
        // Print the output
        System.out.println("The temperature in Celcius is " + celciusResult);
		 
    }
}
