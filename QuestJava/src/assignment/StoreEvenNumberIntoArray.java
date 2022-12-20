package assignment;

import java.util.Scanner;

public class StoreEvenNumberIntoArray 
{
	static void display(int even,int[] a) 
	{
		for(int j=0; j<even; j++) 
		{
			System.out.println("The Array Of "+even+" Elements are: "+ a[j]);
		}
	}
	static int even(int temp) 
	{
		int store =0;
		for(int i= 0 ; i<temp;i++) 
		{
			if(temp%2==0) 
			{
				 store+=i;
			}
		}
		if(store==temp) 
		{
			return 1;
		}
		else 
		{
			return 0;
		}
	}
	public static void main(String[] args) 
	{
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length Of Array: ");
		length = sc.nextInt();
		int[] num = new int[length];
		
		//for read and store all numbers
		for(int i=0; i<length;i++) 
		{
			System.out.println("Enter A Number: ");
			int temp = sc.nextInt();
			int compare = even(temp);
			
			if(compare==1)
			{
				num[i] = temp;
			}
			else
			{
				System.out.println("Please enter a perfect number");
				i=i-1;
			}
		}
		sc.close();
		display(length,num);
	}
}
