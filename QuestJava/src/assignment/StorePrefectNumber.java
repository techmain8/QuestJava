package assignment;

import java.util.Scanner;

public class StorePrefectNumber 
{
	public static int perfect(int num)
	{
		int factsum=0;
		for(int i=1; i<num;i++)
		{
			if(num%i==0)
			{
				factsum+=i;
			}
		}
		if(factsum==num)
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many values you want to enter: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements:	");
		for(int i=0;i<size;i++)
		{
			int temp = sc.nextInt();
			int compare = perfect(temp);
			
			if(compare==1)
			{
				arr[i] = temp;
			}
			else
			{
				System.out.println("Please enter a perfect number");
				i=i-1;
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}

}