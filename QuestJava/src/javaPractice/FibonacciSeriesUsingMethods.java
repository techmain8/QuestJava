package javaPractice;

import java.util.Scanner;

public class FibonacciSeriesUsingMethods 
{
	static int i, count = 0, num1 = 0, num2 = 0, num3;
	
	static void  fib(int num1, int num2, int count) 
	{
		for (i = num1; i < count+2; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First Number :");
		num1 = sc.nextInt();
		System.out.println("Enter The Second Number :");
		num2 = sc.nextInt();
		System.out.println("Enter How Many Number Of Terms To print:");
		count = sc.nextInt();
		sc.close();
		
		fib(num1,num2,count);
	}
}
