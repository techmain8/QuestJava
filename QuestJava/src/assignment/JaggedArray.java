package assignment;

import java.util.Scanner;

public class JaggedArray 
{
	static int row,column;

	public static void display(char[][] array) 
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
		char array[][] = new char[row][];
		
		for(int i = 0; i < row; i++)
		{
			System.out.println("Enter Column Size for "+(i+1)+" row: ");
			column = scan.nextInt();
			array[i] = new char[column];
		}
		
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				System.out.println("Enter value : ");
				array[i][j] = scan.next().charAt(0);
			}
		}
		System.out.println("The Entered Array Is: ");
		display(array);
	}

}
