package assignment;

import java.util.Scanner;

public class FactorialOfSeries
{

	public static void main(String[] args) 
	{
//		1/1! + 2/2! + 3/3! + 4/4! + ........ 
		Scanner sc =new Scanner(System.in);
		Double n,sum,fact;
		System.out.println("Enter The Value of N: ");
		n= sc.nextDouble();
		sc.close();
		sum =(double) 0;
		fact =(double) 1;
		for(int i=1;i<=n;i++) 
		{
			fact = fact*i;
			sum = sum +(i/fact);
		}
		System.out.println(sum +" Is The Value of Series:");
	}

}
