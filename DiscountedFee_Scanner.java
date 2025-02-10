import java.util.Scanner;

public class DiscountedFee_Scanner {

    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);

        // Declare variables for fee and discountPercent
        double fee;
        double discountPercent;

        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble();

        
        System.out.print("Enter the university discount percentage: ");
        discountPercent = input.nextDouble();
        double discount = (discountPercent / 100) * fee;

        // Compute the final discounted fee
        double finalFee = fee - discount;

        // Print the output
        System.out.println("The discount amount is INR " + discount + " and the final discounted fee is INR " + finalFee);
    }
}
