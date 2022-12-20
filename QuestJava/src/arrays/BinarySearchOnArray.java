package arrays;
import java.util.Scanner;

public class BinarySearchOnArray 
{
	static int size,number;
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
	public static void binarySearch(int number,int array[]) 
	{
		int temp = 0;
		int mid = size/2;
		if(number == array[mid]) 
		{
			temp = mid ;
		}
		else if(number < array[mid]) 
		{
			for(int i= 0 ; i<mid; i++) 
			{
				temp = array[i];
				if(temp == number) 
				{
					temp=i;
				}
			}
		}
		else if(number >array[mid]) 
		{

			for(int i= mid ; i< size; i++) 
			{
				temp = array[i];
				if(temp == number) 
				{
					temp=i;
				}
			}
		}
		System.out.println("The Element Is Found At "+(temp+1));
	}
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Size Of Array: ");
		size = input.nextInt();
		
		int[] array = new int[size];
		
		for(int i=0; i<size; i++) 
		{
			System.out.println("Enter The Number: ");
			array[i]= input.nextInt();
		}
		sort(size,array);
		
		System.out.println("\nEnter The Number To Search: ");
		number = input.nextInt();
		binarySearch(number,array);
	}

}
