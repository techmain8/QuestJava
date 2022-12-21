package arrays;

import java.util.Scanner;

public class LienarSearchUsingFunction 
{
	static int i,number,size;
	static void search(int size, int a[]){
		for(i=0; i<size; i++) 
		{
			int temp = a[i];
			if(temp == number) 
			{
				System.out.println("Element Found At: "+ (i+1));
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size: ");
		size = scan.nextInt();
		
		int[] a = new int[size];
		
		for(i=0; i<size; i++) 
		{
			System.out.println("Enter The Number: ");
			a[i]=scan.nextInt();
		}
		
		System.out.println("Enter The Element To Search: ");
		number = scan.nextInt();
		
		search(size,a);
	}

}
