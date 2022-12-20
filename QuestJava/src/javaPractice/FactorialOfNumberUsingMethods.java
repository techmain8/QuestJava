package javaPractice;

import java.util.Scanner;

public class FactorialOfNumberUsingMethods 
{
	static int i,sum = 1,num;
	
	static int fact(int num) 
	{
		for(i=1;i<=num;i++) 
		{
			System.out.println(i);
			sum = sum * i;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number To Find Factorial :");
		num = sc.nextInt();
		sc.close();
		
		fact(num);
		System.out.println("The Factorial of "+num+" is :"+ sum);
	}

}
