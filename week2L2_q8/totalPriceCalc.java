import java.util.Scanner;

public class totalPriceCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double items, unitPrice;

        System.out.print("Enter price of the item: ");
        unitPrice = input.nextDouble();   	   
		
        System.out.print("Enter quantity of the item: ");
        items = input.nextDouble();   
        
		double totalPrice = items*unitPrice; 

        // Print the output
        System.out.println("Total price of " + items + " is " + totalPrice);
		 
    }
}
