import java.util.Scanner;

public class TallestAmongstFriends{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input for age
        System.out.print("Enter the age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = scanner.nextInt();

        // Finding the youngest
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = (youngestAge == ageAmar) ? "Amar" :
                                (youngestAge == ageAkbar) ? "Akbar" : "Anthony";

        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);

        // input for height
        System.out.print("Enter the height of Amar (in cm): ");
        int heightAmar = scanner.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        int heightAkbar = scanner.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        int heightAnthony = scanner.nextInt();

        // Finding the tallest
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar" :
                               (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm");

       

        scanner.close();
    }
}
