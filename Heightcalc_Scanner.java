import java.util.Scanner;

public class Heightcalc_Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variable for height in centimeters
        double heightCm;

        System.out.print("Enter height in centimeters: ");
        heightCm = input.nextDouble();        
        
        double heightInches = heightCm * 0.39;
        double heightFeet = heightInches / 12;

        // Print the output
        System.out.println("Height inputted is " + heightCm + " cm and the height in feet and inches is " + (int)heightFeet + " feet and " + (heightInches % 12) + " inches.");
    }
}
