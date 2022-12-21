package arrays;

import java.util.Scanner;

public class SearchNumberInArray 
{
	
	public static void sort(int size,int[] array) 
	{
		int i;
		for(i =0 ; i<size; i++) 
		{
			for(int j=i+1; j<size; j++) 
			{
				if(array[i] > array[j]) 
				{
					int temp = array[i];
					array[i] = array[j];
					array[j]= temp;
				}
			}
		}
		for(int num:array)
			System.out.print(num);
	}
	public static void main(String[] args) 
	{
		int i,number,size;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size: ");
		size = scan.nextInt();
		
		int[] a = new int[size];
		
		for(i=0; i<size; i++) 
		{
			System.out.println("Enter The Number: ");
			a[i]=scan.nextInt();
		}
		
		sort(size,a);
		

		System.out.println("Enter The Element To Search: ");
		number = scan.nextInt();
		
		for(i=0; i<size; i++) 
		{
			int temp = a[i];
			if(temp == number) 
			{
				System.out.println("Element Found At: "+ (i+1));
			}
		}
		
	}

}
