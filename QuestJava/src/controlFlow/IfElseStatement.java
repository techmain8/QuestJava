package controlFlow;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		//ifElseStatement
		System.out.println("this is a example of IfElseStatement:\n");
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
			else{
				System.out.println("The Greater number is :" + num2);
			}
			System.out.println("Thank you...");
	}

}
