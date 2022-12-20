package assignment;

import java.util.Scanner;

public class SumOfDigitOfNumber 
{

	public static void main(String[] args) 
	{
		int num, digit_count = 0,sum = 0,digit;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = scan.nextInt();
		scan.close();
		
		for(int temp = num; temp > 0; temp = temp / 10)
		{
			digit_count++;
		}
		System.out.println("Number of Digits in " + num + ":" + digit_count);
		System.out.println();
		while(num > 0)  
		{  
		digit = num % 10;  
		sum = sum + digit;  
		num = num / 10; 
		}
		//using for loop
		/*
		 for(sum=0; num!=0; num=num/10)  
			{  
				sum = sum + num%10;  
			}  
		 */
		System.out.println("The Sum Of Digits is: " +sum);
	}
}
