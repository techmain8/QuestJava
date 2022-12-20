package controlFlow;
import java.util.Scanner;

public class SimpleIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 , num2 ;
		System.out.println("Enter The First Number :");
		num1 = input.nextInt();
		System.out.println("Enter The Second Number :");
		num2 = input.nextInt();
		input.close();
		if(num1 > num2) {
			System.out.println("The First number is Greater:");
		}
		if(num2 > num1) {
			System.out.println("The Second Number is Greater:");
		}
		System.out.println("Thank you...");
	}
}
