package assignment;

import java.util.Scanner;

public class SumOfArrayUsingMethod 
{
	static int length,sum = 0;
	
	static int operation(int length, int[] num) 
	{
		for(int i=0 ;i<length;i++) 
		{
			sum+=num[i];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Length of array: ");
		length =sc.nextInt();
		int[] num = new int[length];
	
		for(int i=0 ;i<length;i++) 
		{
			System.out.println("Enter the Array Number "+ (i+1)+" : ");
			 num[i] = sc.nextInt();
		}
		sc.close();
		operation(length,num);
		System.out.println("The Array Of "+length+" Elements Sum Is: "+ sum);
	}
}
