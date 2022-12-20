package assignment;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, count = 0, num1 = 0, num2 = 0, num3;
		System.out.println("Enter The First Number :");
		num1 = sc.nextInt();
		System.out.println("Enter The Second Number :");
		num2 = sc.nextInt();
		System.out.println("Enter How Many Number Of Terms To print:");
		count = sc.nextInt();
		sc.close();
		fib(num1,num2,count);

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
	}

	public static int  fib(int num1, int num2, int count) 
	{
		if (count > 1) 
		{
			count = num1 + num2;
			System.out.println("   " + count);
		}
		else 
		{
			System.out.println("cant be printed ");
			return count;
		}
		return count;
	}
}
