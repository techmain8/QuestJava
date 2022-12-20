package assignment;

import java.util.Scanner;

public class WhileDigitCount 
{
	public static void main(String[] args) 
	{
		int num, digit_count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = scan.nextInt();
		scan.close();
		int temp = num;
		while(temp > 0)
		{
			digit_count++;
			temp = temp/10;
		}
		System.out.println("Number of Digits in " + num + " = " + digit_count);
	}
}
