package assignment;

import java.util.Scanner;

public class TrpAndRatingOfTvChannel 
{
	static double number;
	
	public static void sort(double[] array) 
	{
		int i;
		for(i=0; i<array.length; i++) 
		{
			for(int j=i+1; j<array.length-1; j++) 
			{
				if(array[i] > array[j]) 
				{
					double temp = array[i];
					array[i] = array[j];
					array[j]= temp;
				}
			}
		}
		for(double num:array)
			System.out.print("\t"+num);
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int size;
	

		System.out.println("Enter The Size: ");
		size =scan.nextInt();
	
		
		double[] array = new double[size];
		
		for(int i=0; i<size; i++) 
		{
			System.out.println("Enter A Number: ");
			array[i]= scan.nextInt();
		}
		
		sort(array);
		System.out.println("\nThe smallest is "+array[0]);
		System.out.println("The Highest is "+array[size-1]);
	
		
		System.out.println("\nEnter The Number To Search: ");
		double search = scan.nextDouble();
		
		for(int i=0; i<size; i++) 
		{
			number = array[i];
			if(search == number) 
			{
				System.out.println("Element Found At: "+ (i+1));
				break;
			}
		}
		
	}

}
