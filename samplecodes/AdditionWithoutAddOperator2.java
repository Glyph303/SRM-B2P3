
public class AdditionWithoutAddOperator2  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        double a, b, c;
			
		// Take input

        System.out.print("Enter first number :  ");
        a = input.nextInt();   	   
		
        System.out.print("Enter second number : ");
        b = input.nextInt();   	
		
		   
		
		// operations
		c = a - (-b);
		
        // Print the output
        System.out.println("Result without using + operator is " + c);
		 
    }
}
