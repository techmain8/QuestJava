package assignment;

import java.util.Scanner;

public class TrpAndRevenue 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int rowsize;
		int columnsize;

		System.out.println("Enter The RowSize: ");
		rowsize =scan.nextInt();
		System.out.println("Enter The ColumnSize: ");
		columnsize =scan.nextInt();

		

		int[][] revenue = new int[rowsize][columnsize];
		

		//to read 
		for(int i=0; i<rowsize; i++) 
		{
			System.out.println("Enter numbers into Row "+(i + 1)+" : ");
			for(int j=0; j<columnsize; j++) 
			{
				System.out.println("Enter A Number: ");
				revenue[i][j]= scan.nextInt();
			}
		}
		
		
		//to display 
		System.out.println("S.No--------TRP--------Revenue.");
		for(int i=0; i<rowsize; i++) 
		{
			for(int j=0; j<columnsize; j+=columnsize) 
			{
				System.out.println((i+1)+"-----------"+revenue[i][j]+"----------"+revenue[i][j+1]);
			}
		}
	}
}
