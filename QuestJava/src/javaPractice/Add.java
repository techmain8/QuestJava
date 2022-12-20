package javaPractice;

import java.util.Scanner;

public class Add {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num1 = input.nextInt();
		System.out.println("enter the second number :");
		int num2 = input.nextInt();
		input.close();
		int sum = num1 + num2 ;
		System.out.println("the Area of the circle is :" + sum);
	}
}
