package assignment;


import java.util.Scanner;

public class StoreAndRead 
{
	static int row,column;
	
	public static void display(int[][] array) 
	{
		for(int i=0; i<array.length; i++) 
		{
			for(int j=0; j< array[i].length; j++) 
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size Of Row: ");
		row = scan.nextInt();
		System.out.println("Enter The Size Of Column: ");
		column =scan.nextInt();
		
		int[][] array = new int[row][column];
		
		for(int i=0; i<row; i++) 
		{
			System.out.println("Enter numbers into Row "+(i+1)+" : ");
			for(int j=0; j< column; j++) 
			{
				System.out.println("Enter The Number:");
				array[i][j]= scan.nextInt();
			}
		}
		System.out.println("\nThe Entered Two DArray is: \n");
		display(array);
		
	}

}
