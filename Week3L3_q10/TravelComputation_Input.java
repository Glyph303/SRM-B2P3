// Sample program 2 but with input
import java.util.Scanner;

public class TravelComputation_Input  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        String fromCity, viaCity, toCity;
		double distFromToVia, distViaToTo, timeFromToVia, timeFromToTo, totalDist, totalTime;
			
		// Take input
		
        System.out.print("----- City Details -----  " + "\n");
		

        System.out.print("Enter which city you are travelling from:   ");
        fromCity = input.nextLine();   	   
		
		System.out.print("Enter which city you are travelling via:  ");
        viaCity = input.nextLine();  
        
		System.out.print("Enter which city you are travelling to:  ");
        toCity = input.nextLine();	

        System.out.print("----- Distance and Time Details -----  " + "\n");	
		
		System.out.print("Enter distance between first and second city:  ");
        distFromToVia = input.nextInt();
		System.out.print("Enter Time in Hours for this distance:  ");
        timeFromToVia = input.nextInt();
		
		System.out.print("Enter distance between second and third city:  ");
        distViaToTo = input.nextInt();
		System.out.print("Enter Time in Hours for this distance:  ");
        timeFromToTo = input.nextInt();	   
		
		// operations
		
		totalDist = distFromToVia + distViaToTo;
		totalTime = timeFromToTo + timeFromToVia;
		
		
		
		
        // Print the output
        System.out.println("The distance between " + fromCity + " to" + toCity + " via" + viaCity + " is: " + totalDist);
		System.out.println("The time taken between " + fromCity + " to" + toCity + " via" + viaCity + " is: " + totalTime);
		
    }
}
