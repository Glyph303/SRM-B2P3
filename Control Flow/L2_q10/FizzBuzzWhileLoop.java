import java.util.Scanner;
public class FizzBuzzWhileLoop	 {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

// taking input
System.out.println("Enter a number: ");
int num = scanner.nextInt();

// operations
 if(num % 3 == 0){
    while( int i <= num){
	System.out.print("Fizz");
	}
	}
 else if(num % 5 == 0){
  for(int i = 0; i <= num; i++){
		System.out.println("Buzz \n");
}
}
else if(num % 5 == 0 && num % 3 == 0){
 for(int i = 0; i <= num; i++){
		System.out.println("FizzBuzz \n");
		}
		}
} }

