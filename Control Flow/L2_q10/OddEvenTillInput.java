import java.util.Scanner;
public class OddEvenTillInput { 
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	//Input
	System.out.println("Enter a natural number: ");
	int number = scanner.nextInt();
	if(number > 0){
		for (int i=1; i<= number; i++){
			if(i % 2 == 0){
			System.out.println( i + " is an even number"); }
			else{
			System.out.println( i + " is an odd number"); }
	} }
	else{
System.out.println( number + " is not a natural number") ; } }
}
