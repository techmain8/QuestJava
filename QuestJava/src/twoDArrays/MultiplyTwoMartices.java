package twoDArrays;

import java.util.Scanner;

public class MultiplyTwoMartices 
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
	static void multiply(int[][]array,int[][] second) 
	{
		int[][] multiply = new int[row][column];
		for(int i=0; i<array.length; i++) 
		{
			for(int j=0; j< array[i].length; j++) 
			{
				multiply[i][j] = second[i][j]  * array[i][j];
			}
		}
		display(multiply);
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
		
		int[][] second = new int[row][column];
		
		for(int i=0; i<row; i++) 
		{
			System.out.println("Enter numbers into Row "+(i+1)+" : ");
			for(int j=0; j< column; j++) 
			{
				System.out.println("Enter The Number:");
				second[i][j]= scan.nextInt();
			}
		}
		
		System.out.println("\nThe Entered first Two D-Array is: ");
		display(array);
		System.out.println("\nThe Entered second Two D-Array is: ");
		display(second);
		System.out.println("\nThe Sum Of Two Array's is: ");
		multiply(array,second);
	}

}