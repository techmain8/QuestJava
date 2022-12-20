package assignment;

import java.util.Scanner;

public class MergeTwoArrays 
{
	static int length;

	static void display(int size, int[] dis) 
	{
		for (int i = 0; i < size; i++) 
		{
			System.out.println("The Array Of " + size + " Elements are: " + dis[i]);
		}
	}

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

		int total = length * 2;
		int[] total_Array = new int[total];
		int j = 0;
		for (int i = 0; i < length; i++) 
		{
			total_Array[j] = num[i];
			j++;
		}
		for (int i = 0; i < length; i++) 
		{
			total_Array[j] = a[i];
			j++;
		}
		sc.close();
		System.out.println("\n");
		System.out.println("------------------------------------------");
		System.out.println("The Elements In First Array Are: ");
		display(length, num);
		System.out.println("\n");
		System.out.println("------------------------------------------");
		System.out.println("The Elements In Second Array Are: ");
		display(length, a);
		System.out.println("\n\n\n");
		System.out.println("------------------------------------------");
		System.out.println("The Elements After Mergeing Array Are: ");
		display(total, total_Array);
	}

}
