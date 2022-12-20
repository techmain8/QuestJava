package javaPractice;


import java.util.Scanner;


public class SumOfDigitOfNumberUsingMethods
{

	 static int num, digit_count = 0,sum = 0,digit;
	 
	static int sumOfDigit(int num)
	{
		
		while(num > 0)  
		{  
		digit = num % 10;  
		sum = sum + digit;  
		num = num / 10; 
		}
		return sum;
	}
	static int count(int num) 
	{
		for(int temp = num; temp > 0; temp = temp / 10)
		{
			digit_count++;
		}
		return digit_count;
	}
	
	public static void main(String[] args) 
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = scan.nextInt();
		scan.close();
		
		sumOfDigit( num);
		count( num);
		System.out.println("Number of Digits in " + num + ":" + digit_count);
		System.out.println("The Sum Of Digits is: " +sum);
	}
}
