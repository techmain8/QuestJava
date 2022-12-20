package assignment;

import java.util.Scanner;

public class ReverseAnArray 
{
	static int length ;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of array to store:");
		length =sc.nextInt();
		int[] num = new int[length];
		
		for(int i=0 ; i<length;i++) 
		{
			System.out.println("Enter the Array Number: ");
			num[i] = sc.nextInt();
		}
		sc.close();
		
		for(int j=0; j<length/2; j++) 
		{
			int temp = num[j];
			num[j]= num[length-j-1];
			num[length-j-1]= temp;
		}
		display(length,num);
	}
	
	static void display(int lenght,int[] num) 
	{
		for(int i=0; i<lenght; i++) 
		{
			System.out.println("The Array Of "+length+" Elements are: "+ num[i]);
		}
	}
}