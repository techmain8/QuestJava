package assignment;

import java.util.Scanner;

public class CopyFromArrayToAnotherArray 
{
	static int length;
	static void display(int lenght,int[] dis) 
	{
		for(int i=0; i<lenght; i++) 
		{
			System.out.println("The Array Of "+length+" Elements are: "+ dis[i]);
		}
	}
	public static void main(String[] args) 
	{
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length Of Array: ");
		length = sc.nextInt();
		int[] num = new int[length];
		int[] a ;
		//for read and store all numbers
		for(int i=0; i<length; i++) 
		{
			System.out.println("Enter The Number: ");
				num[i]=sc.nextInt();
		}
		//Display First Array 
		System.out.println("The First Array: ");
		display(length,num);
		
		a = new int[length];
		
		int j=0;
		 for (int i = 0; i<length; i++) 
		 {
			 a[j] = num[i];
			 j++;
		 }
		 sc.close();
		 //Display Second Array
		 System.out.println("The Second array: ");
		 display(length,a);
	}

}
