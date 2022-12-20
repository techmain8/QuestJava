package assignment;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {

		int num, digit_count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = scan.nextInt();
		scan.close();
		
		for(int temp = num; temp > 0; temp = temp / 10)
		{
			digit_count++;
		}
		System.out.println("Number of Digits in " + num + " = " + digit_count);
	}

}
