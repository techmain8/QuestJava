package arrays;

import java.util.Scanner;

public class ReadAndStoreMean 
{
	static int number,size;
	
	static void mean(int[] array) 
	{
		int sum =0;
		for(int i = 0; i<size; i++) 
		{
			 sum = sum + array[i];
		}
		float mean = sum/size;
		System.out.println("Mean Is :"+mean);
		search(mean,array);
		
	}
	static void search(float mean,int[] array) 
	{
		int flag=0;
		for(int i =0; i<size; i++) 
		{
			if(mean == array[i]) 
			{
				flag+=i;
			}
			else 
			{
				System.out.println("Number Is Not Found...");
			}
		}
		System.out.println("The Mean Is Found At: "+ (flag+1));
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size Of Array: ");
		size = scan.nextInt();
		
		int[] array = new int[size];
		
		for(int i=0 ; i<size; i++) 
		{
			System.out.println("Enter Into Array: ");
			array[i]= scan.nextInt();
		}
		mean(array);
	}
	 
}
