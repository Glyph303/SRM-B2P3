import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input month and day
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        // Check if the date is in spring
        boolean isSpring = (month == 3 && day >= 20) || 
                           (month == 4) || 
                           (month == 5) || 
                           (month == 6 && day <= 20);

        // Output result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        
}
