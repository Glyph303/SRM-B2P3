import java.util.Scanner;
public class MultiplicationTable {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

// taking input
System.out.println("Enter a number: ");
int num = scanner.nextInt();
System.out.println("Multiplication table is: \n");
    for(int i = 0; i <= num; i++){
		System.out.println(num + " * " + i + " = " + (num*i));
	}
}
}
