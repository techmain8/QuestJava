package assignment;

import java.util.Scanner;

public class SumOfTwoArrays 
{
	static int length;
	
//	static int[] calculation(int[] num, int[] a) 
//	{
//		
//		
//		return sum;
//	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length Of Array: ");
		length = sc.nextInt();
		int[] num = new int[length];

		System.out.println("Enter The Elements Into First Array: ");
		// for read and store all numbers in array one
		for (int i = 0; i < length; i++) 
		{
			System.out.println("Enter The Number: ");
			num[i] = sc.nextInt();
		}
		// to read and store all numbers in array two
		int[] a = new int[length];
		System.out.println("Enter The Elements Into Second Array: ");
		for (int i = 0; i < length; i++) 
		{
			System.out.println("Enter The Number: ");
			a[i] = sc.nextInt();
		}
		sc.close();

		int total = length * 2;
		int[] sum = new int[total] ;
//		calculation(num,a);
		for (int i=0; i<length; i++) 
		{
			sum[i]= num[i] + a[i];
		}
		System.out.println("The Sum Of Both Array Is: ");
		for(int j=0;j<length;j++) 
		{
			System.out.print(sum[j]);
		}
	}
}
