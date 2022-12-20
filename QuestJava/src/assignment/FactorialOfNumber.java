package assignment;
import java.util.Scanner;

public class FactorialOfNumber 
{

	public static void main(String[] args) 
	{
		int i,sum = 1,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number To Find Factorial :");
		num = sc.nextInt();
		sc.close();
		
		for(i=1;i<=num;i++) 
		{
			System.out.println(i);
			sum = sum * i;
		}
		System.out.println("The Factorial of "+num+" is :"+ sum);
	}

}
