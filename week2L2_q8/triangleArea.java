import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double base, height;

        System.out.print("Enter base value");
        base = input.nextDouble();        
		
		System.out.print("Enter Height value");
        height = input.nextDouble();        
        
        double calcTriangleArea = (0.5)*(base)*(height);

        // Print the output
        System.out.println("Area of the triangle is " + calcTriangleArea) ; 
		 
    }
}
