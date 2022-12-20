package controlFlow;

import java.util.Scanner;

public class GreaterNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 , num2 ;
		System.out.println("Enter The First Number :");
		num1 = input.nextInt();
		System.out.println("Enter The Second Number :");
		num2 = input.nextInt();
		input.close();
		if(num1 > num2) {
			System.out.println("The Greater number is :" + num1);
		}
		if(num2 > num1) {
			System.out.println("The Greater number is :" + num2);
		}
		System.out.println("Thank you...");
	}
}
